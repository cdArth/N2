/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.dao.util.ArrayListDAO;
import com.ftt.deliverysystem.models.ProdutoCategoriaModel;
import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public class ProdutoCategoriaDAO extends ArrayListDAO {

    public ProdutoCategoriaDAO() {
        super("PRODUTO_CATEGORIA");
        super.setInsertSQL(String.format("INSERT INTO %s (nome) VALUES (?)", this.tabela));
        super.setUpdateSQL(String.format("UPDATE %s SET nome= ? WHERE id_categoria = ?", this.tabela));
        super.setDeleteSQL(String.format("DELETE FROM %s WHERE id_categoria = ?", this.tabela));
        super.setFindSQL(String.format("SELECT * FROM %s WHERE id_categoria = ?", this.tabela));
    }

    @Override
    protected void setStatementValues(PreparedStatement stmt, Model m) throws SQLException {
        ProdutoCategoriaModel model = (ProdutoCategoriaModel) m;

        int index = 1;
        stmt.setString(index++, model.getNome());
        if (model.getId() != 0) {
            stmt.setInt(index++, model.getId());
        }
    }

    @Override
    protected ProdutoCategoriaModel convertModel(Model model) {
        return (ProdutoCategoriaModel) model;
    }

    @Override
    protected ProdutoCategoriaModel createModel(ResultSet rs) throws SQLException {
        ProdutoCategoriaModel m = new ProdutoCategoriaModel(
                rs.getInt("id_categoria"),
                rs.getString("nome")
        );
        return m;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<ProdutoCategoriaModel> findAll() {
        return (ArrayList<ProdutoCategoriaModel>) super.findAll();
    }

    @Override
    public ProdutoCategoriaModel find(int id) {
        return (ProdutoCategoriaModel) (super.find(id));
    }

    public void insert(ProdutoCategoriaModel model) {
        super.insert(model);
    }

    public void update(ProdutoCategoriaModel model) {
        super.update(model);
    }

    public void delete(ProdutoCategoriaModel model) {
        super.delete(model);
    }

    
    public ProdutoCategoriaModel find(String nome){
        String sql = String.format("SELECT * FROM %s WHERE nome = ?", this.tabela);
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.execute();
            return (ProdutoCategoriaModel) (executeResultSet(stmt));
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }




}
