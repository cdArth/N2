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
public class VendedorModel {

    public int id_vendedor;
    public UserModel usuario;
    public String nome;
    public String cnpj;
    public EnderecoModel endereco;
    public String parceiro;
    public ImagemModel imagem;

    public VendedorModel(int id_vendedor, UserModel usuario, String nome, String cnpj, EnderecoModel endereco, String parceiro, ImagemModel imagem) {
        this.id_vendedor = id_vendedor;
        this.usuario = usuario;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.parceiro = parceiro;
        this.imagem = imagem;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public String getParceiro() {
        return parceiro;
    }

    public void setParceiro(String parceiro) {
        this.parceiro = parceiro;
    }

    public ImagemModel getImagem() {
        return imagem;
    }

    public void setImagem(ImagemModel imagem) {
        this.imagem = imagem;
    }
    
    
}
