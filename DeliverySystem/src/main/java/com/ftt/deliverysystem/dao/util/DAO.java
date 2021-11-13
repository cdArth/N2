/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao.util;

/**
 *
 * @author lukas
 */
import com.ftt.deliverysystem.models.util.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class DAO implements IDAO {

    private Connection connection;
    protected String tabela;
    private String insertSQL;
    private String updateSQL;
    private String deleteSQL;

    public DAO(String tabela) {
        this.connection = DatabaseConnection.getConnection();
        this.tabela = tabela;
    }

    protected abstract void setStatementValues(PreparedStatement stmt, Model model) throws SQLException;

    protected abstract Model createModel(ResultSet rs) throws SQLException;

    protected void setInsertSQL(String sql) {
        this.insertSQL = sql;
    }

    protected void setUpdateSQL(String sql) {
        this.updateSQL = sql;
    }

    protected void setDeleteSQL(String sql) {
        this.deleteSQL = sql;
    }

    @Override
    public Model insert(Model model) {
        System.out.println(this.insertSQL);
        try (PreparedStatement stmt = this.connection.prepareStatement(this.insertSQL, Statement.RETURN_GENERATED_KEYS)) {
            this.setStatementValues(stmt, model);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Insert falhou, nenhum linha afetada.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    model.setId(generatedKeys.getInt(1));
                    return model;
                } else {
                    throw new SQLException("Insert falhou, nenhum ID encontrado.");
                }
            }
        } catch (SQLException ex) {
            this.treatException(ex);
        }
        return null;
    }

    @Override
    public Model update(Model model) {
        try (PreparedStatement stmt = this.connection.prepareStatement(this.updateSQL, Statement.RETURN_GENERATED_KEYS)) {
            this.setStatementValues(stmt, model);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("update falhou, nenhum linha afetada.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    model.setId(generatedKeys.getInt(1));
                    return model;
                } else {
                    throw new SQLException("update falhou, nenhum ID encontrado.");
                }
            }
        } catch (SQLException ex) {
            this.treatException(ex);
        }
        return null;
    }

    @Override
    public void delete(Model model) {
        String sql = deleteSQL;
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setInt(1, model.getId());
            stmt.execute();
        } catch (SQLException ex) {
            this.treatException(ex);
        }
    }

    @Override
    public Model find(int id) {
        String sql = String.format("SELECT * FROM %s WHERE id_usuario = ?", this.tabela);
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
            return executeResultSet(stmt);
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }

    @SuppressWarnings("rawtypes")
    @Override
    public ArrayList findAll() {
        String sql = String.format("SELECT * FROM %s", this.tabela);
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            ArrayList list = new ArrayList<Model>();
            return executeResultSet(stmt, list);
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }

    private Model executeResultSet(PreparedStatement stmt) {
        try (ResultSet rs = stmt.getResultSet()) {
            if (rs.next()) {
                return createModel(rs);
            } else {
                return null;
            }
        } catch (Exception ex) {
            this.treatException(ex);
            return null;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private ArrayList executeResultSet(Statement stmt, ArrayList list) {
        try (ResultSet rs = stmt.getResultSet()) {
            while (rs.next()) {
                Model model = this.createModel(rs);
                list.add(model);
            }
            return list;
        } catch (Exception ex) {
            this.treatException(ex);
        }
        return null;
    }

    private void treatException(Exception ex) {
        System.out.println(ex.getMessage());
        ex.printStackTrace();
    }

}
