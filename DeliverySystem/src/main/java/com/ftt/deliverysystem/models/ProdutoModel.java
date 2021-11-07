/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.models;

/**
 *
 * @author lukas
 */
public class ProdutoModel {

    public int id_produto;
    public String nome;
    public String descricao;
    public ProdutoCategoriaModel categoria;

    public ProdutoModel(int id_produto, String nome, String descricao, ProdutoCategoriaModel categoria) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
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
    
    
}
