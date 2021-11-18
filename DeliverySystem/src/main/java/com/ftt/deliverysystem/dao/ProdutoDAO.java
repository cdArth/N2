/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.dao.util.DAO;
import com.ftt.deliverysystem.models.ImagemModel;
import com.ftt.deliverysystem.models.ProdutoCategoriaModel;
import com.ftt.deliverysystem.models.ProdutoModel;
import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lukas
 */
public class ProdutoDAO extends DAO {

    public ProdutoDAO() {
        super("PRODUTO");
        super.setInsertSQL(String.format("INSERT INTO %s (nome,descricao,id_categoria) VALUES (?, ?, ?)", this.tabela));
        super.setUpdateSQL(String.format("UPDATE %s SET nome = ?, descricao = ?, id_categoria = ? WHERE id_produto = ?", this.tabela));
        super.setDeleteSQL(String.format("DELETE FROM %s WHERE id_produto = ?", this.tabela));
        super.setFindSQL(String.format("SELECT * FROM %s WHERE id_produto = ?", this.tabela));
    }

    @Override
    protected void setStatementValues(PreparedStatement stmt, Model model) throws SQLException {
        ProdutoModel m = (ProdutoModel) model;

        int index = 1;
        if (m.getId() != 0) {
            stmt.setInt(index++, m.getId());
        }
        stmt.setString(index++, m.getNome());
        stmt.setString(index++, m.getDescricao());
        stmt.setString(index++, m.getCategoria().getNome());
    }

    @Override
    protected Model createModel(ResultSet rs) throws SQLException {
        ProdutoCategoriaDAO pcdao = new ProdutoCategoriaDAO();
        ImagemDAO idao = new ImagemDAO();

        ProdutoModel pm = new ProdutoModel(
                rs.getInt("id_produto"),
                rs.getString("nome"),
                rs.getString("descricao"),
                (ProdutoCategoriaModel) pcdao.find(rs.getInt("id_categoria")));

        pm.setImagem((ImagemModel) idao.findPorProduto(pm.getId()));
        return pm;
    }

}
