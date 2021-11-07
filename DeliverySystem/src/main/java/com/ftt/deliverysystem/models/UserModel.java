package com.ftt.deliverysystem.models;

import java.sql.Date;

/**
 *
 * @author lukas
 */
public class UserModel {
//USUARIO (id_usuario, usuario, senha, email, telefone, privilegio_administrador)

    private int id_usuario;
    private String usuario;
    private String senha;
    private String email;
    private String telefone;
    private java.sql.Date data_nascimento;
    
    public UserModel(int id_usuario, String usuario, String senha, String email, String telefone, Date data_nascimento) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

}
