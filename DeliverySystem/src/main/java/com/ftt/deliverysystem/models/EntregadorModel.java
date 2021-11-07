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
public class EntregadorModel {

    private int id_entregador;
    private UserModel usuario;
    private String nome;

    public EntregadorModel(int id_entregador, UserModel usuario, String nome) {
        this.id_entregador = id_entregador;
        this.usuario = usuario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_entregador() {
        return id_entregador;
    }

    public void setId_entregador(int id_entregador) {
        this.id_entregador = id_entregador;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }
    
    
}
