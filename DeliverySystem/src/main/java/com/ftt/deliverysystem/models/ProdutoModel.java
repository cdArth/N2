/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.models;

import com.ftt.deliverysystem.models.util.Model;

/**
 *
 * @author lukas
 */
public class ProdutoModel implements Model{

    public int id;
    public String nome;
    public String descricao;
    public ProdutoCategoriaModel categoria;

    public ProdutoModel(int id, String nome, String descricao, ProdutoCategoriaModel categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    public ProdutoModel(String nome, String descricao, ProdutoCategoriaModel categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int getId_produto() {
        return id;
    }

    public void setId_produto(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProdutoCategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoriaModel categoria) {
        this.categoria = categoria;
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }

}
