package com.ftt.deliverysystem.models;

import java.sql.Date;

/**
 *
 * @author lukas
 */
public class UserModel {

    private int _id_usuario;
    private String _usuario;
    private String _senha;
    private String _email;
    private String _telefone;
    private java.sql.Date _data_nascimento;

    public UserModel(int _id_usuario, String _usuario, String _senha, String _email, String _telefone, Date _data_nascimento) {
        this._id_usuario = _id_usuario;
        this._usuario = _usuario;
        this._senha = _senha;
        this._email = _email;
        this._telefone = _telefone;
        this._data_nascimento = _data_nascimento;
    }

    public int getId_usuario() {
        return _id_usuario;
    }

    public void setId_usuario(int _id_usuario) {
        this._id_usuario = _id_usuario;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public String getSenha() {
        return _senha;
    }

    public void setSenha(String _senha) {
        this._senha = _senha;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String _telefone) {
        this._telefone = _telefone;
    }

    public Date getData_nascimento() {
        return _data_nascimento;
    }

    public void setData_nascimento(Date _data_nascimento) {
        this._data_nascimento = _data_nascimento;
    }

}
