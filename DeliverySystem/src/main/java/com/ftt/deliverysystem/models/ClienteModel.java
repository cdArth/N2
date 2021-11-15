package com.ftt.deliverysystem.models;

import com.ftt.deliverysystem.models.util.Model;

public class ClienteModel implements Model {

    private int id_cliente;
    private int usuario;
    private String nome;
    private String cpf;
    private int endereco;
    private boolean passe_vip;

    @Override
    public int getId() {
        return id_cliente;
    }

    @Override
    public void setId(int id) {
        this.id_cliente = id;
    }
    public ClienteModel(int id_cliente, int usuario, String nome, String cpf, int endereco, boolean passe_vip) {
        this.id_cliente = id_cliente;
        this.usuario = usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.passe_vip = passe_vip;
    }
    public ClienteModel(int usuario, String nome, String cpf, int endereco, boolean passe_vip) {
        this.id_cliente = 0;
        this.usuario = usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.passe_vip = passe_vip;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public boolean isPasse_vip() {
        return passe_vip;
    }

    public void setPasse_vip(boolean passe_vip) {
        this.passe_vip = passe_vip;
    }

}
