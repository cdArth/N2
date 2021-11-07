package com.ftt.deliverysystem.models;

public class ClienteModel {

  private int _id_cliente;
  private UserModel _usuario;
  private String _nome;
  private String _cpf;
  private EnderecoModel _endereco;
  private boolean _passe_vip;

  public int getid_cliente() {
    return this._id_cliente;
  }

  public void setid_cliente(int value) {
    this._id_cliente = value;
  }

  public UserModel getusuario() {
    return this._usuario;
  }

  public void setusuario(UserModel value) {
    this._usuario = value;
  }

  public String getnome() {
    return this._nome;
  }

  public void setnome(String value) {
    this._nome = value;
  }

  public String getcpf() {
    return this._cpf;
  }

  public void setcpf(String value) {
    this._cpf = value;
  }

  public EnderecoModel getendereco() {
    return this._endereco;
  }

  public void setendereco(EnderecoModel value) {
    this._endereco = value;
  }

  public boolean getpasse_vip() {
    return this._passe_vip;
  }

  public void setpasse_vip(boolean value) {
    this._passe_vip = value;
  }

  public ClienteModel(
    int id_cliente_,
    UserModel usuario_,
    String nome_,
    String cpf_,
    EnderecoModel endereco_,
    boolean passe_vip_
  ) {
    this._id_cliente = id_cliente_;
    this._usuario = usuario_;
    this._nome = nome_;
    this._cpf = cpf_;
    this._endereco = endereco_;
    this._passe_vip = passe_vip_;
  }
}
