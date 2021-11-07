package com.ftt.deliverysystem.models;

/**
 *
 * @author lukas
 */
public class EnderecoModel {

    private int id_endereco;
    private UserModel usuario;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;

    public EnderecoModel(int id_endereco, UserModel usuario, String endereco, String bairro, String cidade, String uf) {
        this.id_endereco = id_endereco;
        this.usuario = usuario;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
