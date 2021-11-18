/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.dao.util.DAO;
import com.ftt.deliverysystem.models.ImagemModel;
import com.ftt.deliverysystem.models.util.Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lukas
 */
public class ImagemDAO extends DAO {

    public ImagemDAO() {
        super("IMAGEM");
        super.setInsertSQL(String.format("INSERT INTO %s (base_imagem,nome_arquivo,extensao,data_criacao) VALUES (?, ?, ?, SYSDATETIME())", this.tabela));
        super.setUpdateSQL(String.format("UPDATE %s SET base_imagem = ? WHERE id_imagem = ?", this.tabela));
        super.setDeleteSQL(String.format("DELETE FROM %s WHERE id_imagem = ?", this.tabela));
        super.setFindSQL(String.format("SELECT * FROM %s WHERE id_imagem = ?", this.tabela));
    }

    @Override
    protected void setStatementValues(PreparedStatement stmt, Model model) throws SQLException {

        ImagemModel m = (ImagemModel) model;

        int index = 1;
        if (m.getId() != 0) {
            stmt.setInt(index++, m.getId());
        }
        stmt.setString(index++, m.getBaseimagem());
        stmt.setString(index++, m.getNome_arquivo());
        stmt.setString(index++, m.getExtensao());
    }

    @Override
    protected Model createModel(ResultSet rs) throws SQLException {
        ImagemModel pm = new ImagemModel(
                rs.getInt("id_imagem"),
                rs.getString("base_imagem"),
                rs.getString("nome_arquivo"),
                rs.getString("extensao")
        );
        return pm;
    }

    public Model findPorProduto(int id) {
        String sql = "SELECT * FROM IMAGEM I "
                + "JOIN PRODUTO_IMAGEM PI ON I.id_imagem = PI.id_imagem"
                + "WHERE PI.id_produto = ?";
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
            return executeResultSet(stmt);
        } catch (SQLException ex) {
            this.treatException(ex);
            return null;
        }
    }

}
