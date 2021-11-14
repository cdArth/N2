/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.dao.util.DAO;
import com.ftt.deliverysystem.models.UserModel;
import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public class UserDAO extends DAO {

    public UserDAO() {
        super("USUARIO");
        super.setInsertSQL(String.format("INSERT INTO %s (senha,email,telefone,data_nascimento) VALUES (?, ?, ?, ?)", this.tabela));
        super.setUpdateSQL(String.format("UPDATE %s SET email = ?, senha = ?, telefone = ?, data_nascimento = ? WHERE id_usuario = ?", this.tabela));
        super.setDeleteSQL(String.format("DELETE FROM %s WHERE id_usuario = ?", this.tabela));
        super.setFindSQL(String.format("SELECT * FROM %s WHERE id_usuario = ?", this.tabela));
    }

    @Override
    protected void setStatementValues(PreparedStatement stmt, Model m) throws SQLException {
        UserModel model = (UserModel) m;

        int index = 1;
        stmt.setString(index++, model.getEmail());
        stmt.setString(index++, model.getSenha());
        stmt.setString(index++, model.getTelefone());
        stmt.setDate(index++, model.getDataNascimento());//new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format()));

        if (model.getId() != 0) {
            stmt.setInt(index++, model.getId());
        }
    }

    @Override
    protected UserModel createModel(ResultSet rs) throws SQLException {
        UserModel userModel = null;
        userModel = new UserModel(
                rs.getInt("id_usuario"),
                rs.getString("senha"),
                rs.getString("email"),
                rs.getString("telefone"),
                rs.getDate("data_nascimento")
        );
        return userModel;
    }

    protected UserModel convertModel(Model model) {
        return (UserModel) model;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<UserModel> findAll() {
        return (ArrayList<UserModel>) super.findAll();
    }

    @Override
    public UserModel find(int id) {
        return (UserModel) (super.find(id));
    }

    public void insert(UserModel model) {
        super.insert(model);
    }

    public void update(UserModel model) {
        super.update(model);
    }

    public void delete(UserModel model) {
        super.delete(model);
    }

    public UserModel find(String email) {
        String sql = String.format("SELECT * FROM %s WHERE email = ?", this.tabela);
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.execute();
            return (UserModel)(executeResultSet(stmt));
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }
}
