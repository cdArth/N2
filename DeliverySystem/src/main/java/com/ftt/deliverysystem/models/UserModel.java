package com.ftt.deliverysystem.models;

import com.ftt.deliverysystem.models.util.Model;
import java.sql.Date;

/**
 *
 * @author lukas
 */
public class UserModel implements Model {
//USUARIO (id_usuario, usuario, senha, email, telefone, privilegio_administrador)

    private int id;
    private String senha;
    private String email;
    private String telefone;
    private java.sql.Date dataNascimento;

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }

    public UserModel(int id, String senha, String email, String telefone, Date dataNascimento) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public UserModel(String senha, String email, String telefone, Date dataNascimento) {
        this.id = 0;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
