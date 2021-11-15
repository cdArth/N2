/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.controllers;

import com.ftt.deliverysystem.dao.EnderecoDAO;
import com.ftt.deliverysystem.dao.util.HelperDAO;
import com.ftt.deliverysystem.models.ClienteModel;
import com.ftt.deliverysystem.models.EnderecoModel;
import com.ftt.deliverysystem.models.UserModel;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class ClienteController {
        public void Insert(UserModel user, EnderecoModel adress, ClienteModel cliente) {
        HelperDAO hdao = new HelperDAO();
        EnderecoDAO dao = new EnderecoDAO();
        if (hdao.check(user, adress, cliente)) {
            dao.insert(cliente);
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
        EnderecoDAO dao = new EnderecoDAO();
        ArrayList<ClienteModel> lista = dao.findAll();
        return lista;

    }
}
