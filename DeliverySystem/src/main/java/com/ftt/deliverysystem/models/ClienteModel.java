package com.ftt.deliverysystem.models;

public class ClienteModel {

    private int id_cliente;
    private UserModel usuario;
    private String nome;
    private String cpf;
    private EnderecoModel endereco;
    private boolean passe_vip;

    public ClienteModel(int id_cliente, UserModel usuario, String nome, String cpf, EnderecoModel endereco, boolean passe_vip) {
        this.id_cliente = id_cliente;
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

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
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

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public boolean isPasse_vip() {
        return passe_vip;
    }

    public void setPasse_vip(boolean passe_vip) {
        this.passe_vip = passe_vip;
    }

}
