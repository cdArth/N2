package com.ftt.deliverysystem.models;

import com.ftt.deliverysystem.models.util.Model;

/**
 *
 * @author lukas
 */
public class EnderecoModel implements Model{

    private int id_endereco;
    private int usuario;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;

    @Override
    public int getId() {
        return id_endereco;
    }

    @Override
    public void setId(int id) {
        this.id_endereco = id;
    }

    public EnderecoModel(int id_endereco, int usuario, String endereco, String bairro, String cidade, String uf) {
        this.id_endereco = id_endereco;
        this.usuario = usuario;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public EnderecoModel(int usuario, String endereco, String bairro, String cidade, String uf) {
        this.id_endereco = 0;
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

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
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
