package com.ftt.deliverysystem.models;

/**
 *
 * @author lukas
 */
public class EnderecoModel {

  private int _id_endereco;
  private UserModel _usuario;
  private String _endereco;
  private String _bairro;
  private String _cidade;
  private String _uf;

  public int getid_endereco() {
    return this._id_endereco;
  }

  public void setid_endereco(int value) {
    this._id_endereco = value;
  }

  public UserModel getusuario() {
    return this._usuario;
  }

  public void setusuario(UserModel value) {
    this._usuario = value;
  }

  public String getendereco() {
    return this._endereco;
  }

  public void setendereco(String value) {
    this._endereco = value;
  }

  public String getbairro() {
    return this._bairro;
  }

  public void setbairro(String value) {
    this._bairro = value;
  }

  public String getcidade() {
    return this._cidade;
  }

  public void setcidade(String value) {
    this._cidade = value;
  }

  public String getuf() {
    return this._uf;
  }

  public void setuf(String value) {
    this._uf = value;
  }

  public EnderecoModel(
    int id_endereco_,
    UserModel usuario_,
    String endereco_,
    String bairro_,
    String cidade_,
    String uf_
  ) {
    this._id_endereco = id_endereco_;
    this._usuario = usuario_;
    this._endereco = endereco_;
    this._bairro = bairro_;
    this._cidade = cidade_;
    this._uf = uf_;
  }
}
