/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.dao.util.DAO;
import com.ftt.deliverysystem.models.ClienteModel;
import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class ClienteDAO extends DAO {
    
    public ClienteDAO() {
        super("CLIENTE");
        super.setInsertSQL(String.format("INSERT INTO %s (id_cliente,id_usuario,nome,cpf,id_endereco,passe_vip) VALUES (?, ?, ?, ?, ?, ?)", this.tabela));
        super.setUpdateSQL(String.format("UPDATE %s SET id_usuario = ?, nome = ?, cpf = ?, id_endereco = ?, passe_vip = ? WHERE id_cliente = ?", this.tabela));
        super.setDeleteSQL(String.format("DELETE FROM %s WHERE id_cliente = ?", this.tabela));
        super.setFindSQL(String.format("SELECT * FROM %s WHERE id_cliente = ?", this.tabela));
    }

    @Override
    protected void setStatementValues(PreparedStatement stmt, Model m) throws SQLException {
        ClienteModel model = (ClienteModel) m;

        int index = 1;
        stmt.setString(index++, model.getCpf());
        stmt.setString(index++, model.getNome());
        stmt.setInt(index++, model.getEndereco());
        stmt.setBoolean(index++, model.isPasse_vip());
        stmt.setInt(index++, model.getUsuario());

        if (model.getId_cliente() != 0) {
            stmt.setInt(index++, model.getId_cliente());
        }
    }

    @Override
    protected ClienteModel createModel(ResultSet rs) throws SQLException {
        ClienteModel clienteModel = null;
        clienteModel = new ClienteModel(
                
                rs.getInt("id_cliente"),
                rs.getInt("id_usuario"),
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getInt("id_endereco"),
                rs.getBoolean("passe_vip")
        );
        return clienteModel;
    }

    protected ClienteModel convertModel(Model model) {
        return (ClienteModel) model;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<ClienteModel> findAll() {
        return (ArrayList<ClienteModel>) super.findAll();
    }

    @Override
    public ClienteModel find(int id) {
        return (ClienteModel) (super.find(id));
    }

    public void insert(ClienteModel model) {
        super.insert(model);
    }

    public void update(ClienteModel model) {
        super.update(model);
    }

    public void delete(ClienteModel model) {
        super.delete(model);
    }

    
    public ClienteModel find(String cpf){
        String sql = String.format("SELECT * FROM %s WHERE cpf = ?", this.tabela);
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            stmt.execute();
            return (ClienteModel) (executeResultSet(stmt));
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }


}
