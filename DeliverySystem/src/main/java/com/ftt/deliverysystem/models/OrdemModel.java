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
public class OrdemModel {

    private int id_ordem;
    private ClienteModel cliente;
    private VendedorModel vendedor;
    private EntregadorModel entregador;
    private StatusEnum status;
    private java.sql.Date data_atualizacao;
    private java.sql.Date data_criacao;

    public OrdemModel(int id_ordem, ClienteModel cliente, VendedorModel vendedor, EntregadorModel entregador, StatusEnum status, Date data_atualizacao, Date data_criacao) {
        this.id_ordem = id_ordem;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.entregador = entregador;
        this.status = status;
        this.data_atualizacao = data_atualizacao;
        this.data_criacao = data_criacao;
    }

    public java.sql.Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(java.sql.Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId_ordem() {
        return id_ordem;
    }

    public void setId_ordem(int id_ordem) {
        this.id_ordem = id_ordem;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public VendedorModel getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorModel vendedor) {
        this.vendedor = vendedor;
    }

    public EntregadorModel getEntregador() {
        return entregador;
    }

    public void setEntregador(EntregadorModel entregador) {
        this.entregador = entregador;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public java.sql.Date getData_atualizacao() {
        return data_atualizacao;
    }

    public void setData_atualizacao(java.sql.Date data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }
}
