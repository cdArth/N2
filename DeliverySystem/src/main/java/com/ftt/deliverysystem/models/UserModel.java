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
public class UserModel {
//USUARIO (id_usuario, usuario, senha, email, telefone, privilegio_administrador)
private int idUser;
private String User;
private String senha;
private String email;
private String telefone;
private boolean premium;

    public UserModel(int idUser, String User, String senha, String email, String telefone, boolean premium) {
        this.idUser = idUser;
        this.User = User;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.premium = premium;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
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

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

}
