/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.models;

import java.sql.Date;

/**
 *
 * @author lukas
 */
public class ImagemModel {

    private int id_imagem;
    private String blob_imagem;
    private String nome_arquivo;
    private String extensao;
    private java.sql.Date data_criacao;

    public ImagemModel(int id_imagem, String blob_imagem, String nome_arquivo, String extensao, Date data_criacao) {
        this.id_imagem = id_imagem;
        this.blob_imagem = blob_imagem;
        this.nome_arquivo = nome_arquivo;
        this.extensao = extensao;
        this.data_criacao = data_criacao;
    }

    public java.sql.Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(java.sql.Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(int id_imagem) {
        this.id_imagem = id_imagem;
    }

    public String getBlob_imagem() {
        return blob_imagem;
    }

    public void setBlob_imagem(String blob_imagem) {
        this.blob_imagem = blob_imagem;
    }

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }    
}
