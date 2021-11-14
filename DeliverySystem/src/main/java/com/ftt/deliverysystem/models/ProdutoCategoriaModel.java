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
public class ProdutoCategoriaModel implements Model {

    private int id_categoria;
    private String nome;

    public ProdutoCategoriaModel(int id_categoria, String nome) {
        this.id_categoria = id_categoria;
        this.nome = nome;
    }
    public ProdutoCategoriaModel(String nome) {
        this.id_categoria = 0;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id_categoria;
    }

    public void setId(int id_categoria) {
        this.id_categoria = id_categoria;
    }

}
