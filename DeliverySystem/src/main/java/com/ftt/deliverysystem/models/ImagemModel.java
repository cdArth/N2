/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.models;

import com.ftt.deliverysystem.dao.ImagemDAO;
import com.ftt.deliverysystem.models.util.Model;
import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class ImagemModel implements Model {

    private int id_imagem;
    private String base_imagem;
    private String nome_arquivo;
    private String extensao;

    public ImagemModel(int id_imagem, String base_imagem, String nome_arquivo, String extensao) {
        this.id_imagem = id_imagem;
        this.base_imagem = base_imagem;
        this.nome_arquivo = nome_arquivo;
        this.extensao = extensao;
    }

    public ImagemModel(String base_imagem, String nome_arquivo, String extensao) {
        this.id_imagem = 0;
        this.base_imagem = base_imagem;
        this.nome_arquivo = nome_arquivo;
        this.extensao = extensao;
    }

    public int getId() {
        return id_imagem;
    }

    public void setId(int id_imagem) {
        this.id_imagem = id_imagem;
    }

    public String getBaseimagem() {
        return base_imagem;
    }

    public void setBaseimagem(String base_imagem) {
        this.base_imagem = base_imagem;
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

    public ImagemModel(String path) {
        try {
            File file = new File(path);

            FileInputStream fileInputStreamReader = new FileInputStream(file);

            byte[] bytes = new byte[(int) file.length()];
            fileInputStreamReader.read(bytes);
            String encoded = new String(Base64.getEncoder().encode(bytes), "UTF-8");

            this.base_imagem = encoded;

            int index = file.getName().lastIndexOf('.');
            if (index > 0) {
                this.extensao = file.getName().substring(index + 1);
            }
            this.nome_arquivo =  file.getName().substring(0, index);

        } catch (Exception ex) {
            Logger.getLogger(ImagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
