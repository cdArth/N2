package com.ftt.deliverysystem.models;

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

  public int getid_usuario() {
    return this._id_usuario;
  }

  public void setid_usuario(int value) {
    this._id_usuario = value;
  }

  public String getusuario() {
    return this._usuario;
  }

  public void setusuario(String value) {
    this._usuario = value;
  }

  public String getsenha() {
    return this._senha;
  }

  public void setsenha(String value) {
    this._senha = value;
  }

  public String getemail() {
    return this._email;
  }

  public void setemail(String value) {
    this._email = value;
  }

  public String gettelefone() {
    return this._telefone;
  }

  public void settelefone(String value) {
    this._telefone = value;
  }

  public java.sql.Date getdata_nascimento() {
    return this._data_nascimento;
  }

  public void setdata_nascimento(java.sql.Date value) {
    this._data_nascimento = value;
  }

  public UserModel(
    int id_usuario_,
    String usuario_,
    String senha_,
    String email_,
    String telefone_,
    java.sql.Date data_nascimento_
  ) {
    this._id_usuario = id_usuario_;
    this._usuario = usuario_;
    this._senha = senha_;
    this._email = email_;
    this._telefone = telefone_;
    this._data_nascimento = data_nascimento_;
  }
}
