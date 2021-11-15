/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.dao.util.DAO;
import com.ftt.deliverysystem.models.EnderecoModel;
import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class EnderecoDAO extends DAO {

    public EnderecoDAO() {
        super("ENDERECO");
        super.setInsertSQL(String.format("INSERT INTO %s (endereco,bairro,cidade,uf) VALUES (?, ?, ?, ?)", this.tabela));
        super.setUpdateSQL(String.format("UPDATE %s SET endereco = ?, bairro = ?, cidade = ?, uf = ? WHERE id_usuario = ?", this.tabela));
        super.setDeleteSQL(String.format("DELETE FROM %s WHERE id_usuario = ?", this.tabela));
        super.setFindSQL(String.format("SELECT * FROM %s WHERE id_usuario = ?", this.tabela));
    }

    @Override
    protected void setStatementValues(PreparedStatement stmt, Model m) throws SQLException {
        EnderecoModel model = (EnderecoModel) m;

        int index = 1;
        stmt.setString(index++, model.getBairro());
        stmt.setString(index++, model.getCidade());
        stmt.setString(index++, model.getEndereco());
        stmt.setString(index++, model.getUf());
        stmt.setInt(index++, model.getUsuario());

        if (model.getId_endereco() != 0) {
            stmt.setInt(index++, model.getId_endereco());
        }
    }

    @Override
    protected EnderecoModel createModel(ResultSet rs) throws SQLException {
        EnderecoModel enderecoModel = null;
        enderecoModel = new EnderecoModel(
                
                rs.getInt("id_endereco"),
                rs.getString("endereco"),
                rs.getString("bairro"),
                rs.getString("cidade"),
                rs.getString("uf")
        );
        return enderecoModel;
    }

    protected EnderecoModel convertModel(Model model) {
        return (EnderecoModel) model;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<EnderecoModel> findAll() {
        return (ArrayList<EnderecoModel>) super.findAll();
    }

    @Override
    public EnderecoModel find(int id) {
        return (EnderecoModel) (super.find(id));
    }

    public void insert(EnderecoModel model) {
        super.insert(model);
    }

    public void update(EnderecoModel model) {
        super.update(model);
    }

    public void delete(EnderecoModel model) {
        super.delete(model);
    }

    
    public EnderecoModel find(String endereco){
        String sql = String.format("SELECT * FROM %s WHERE endereco = ?", this.tabela);
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, endereco);
            stmt.execute();
            return (EnderecoModel) (executeResultSet(stmt));
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }

}
