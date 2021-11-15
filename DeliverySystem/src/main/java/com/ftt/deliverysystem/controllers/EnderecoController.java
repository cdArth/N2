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
public class EnderecoController{
    
    public void Insert(UserModel user, EnderecoModel adress, ClienteModel cliente) {
        HelperDAO hdao = new HelperDAO();
        EnderecoDAO dao = new EnderecoDAO();
        if (hdao.check(user, adress, cliente)) {
            dao.insert(adress);
        }
    }

    public void Update(EnderecoModel adress) {

        EnderecoDAO dao = new EnderecoDAO();
        adress.setId(dao.find(adress.getEndereco()).getId());
        dao.update(adress);
    }

    public void Delete(EnderecoModel adress) {
        EnderecoDAO dao = new EnderecoDAO();
        dao.delete(adress);

    }

    public ArrayList<EnderecoModel> Listar() {
        EnderecoDAO dao = new EnderecoDAO();
        ArrayList<EnderecoModel> lista = dao.findAll();
        return lista;

    }
}
