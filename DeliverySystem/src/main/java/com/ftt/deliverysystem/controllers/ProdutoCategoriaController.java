/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.controllers;

import com.ftt.deliverysystem.dao.ClienteDAO;
import com.ftt.deliverysystem.dao.EnderecoDAO;
import com.ftt.deliverysystem.dao.ProdutoCategoriaDAO;
import com.ftt.deliverysystem.dao.util.HelperDAO;
import com.ftt.deliverysystem.models.ClienteModel;
import com.ftt.deliverysystem.models.ProdutoCategoriaModel;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class ProdutoCategoriaController {
    public void Insert(ProdutoCategoriaModel model) {
        HelperDAO hdao = new HelperDAO();
        ProdutoCategoriaDAO dao = new ProdutoCategoriaDAO();
        if (hdao.checkProduto(model)) {
            dao.insert(model);
        }
    }

    public void Update(ClienteModel cliente) {

        EnderecoDAO dao = new EnderecoDAO();
        cliente.setId(dao.find(cliente.getCpf()).getId());
        dao.update(cliente);
    }

    public void Delete(ClienteModel cliente) {
        EnderecoDAO dao = new EnderecoDAO();
        dao.delete(cliente);

    }

    public ArrayList<ClienteModel> Listar() {
        ClienteDAO dao = new ClienteDAO();
        ArrayList<ClienteModel> lista = dao.findAll();
        return lista;

    }

}
