/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.models.ProdutoCategoriaModel;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lukas
 */
public class ProdutoCategoriaDAOTest {

    public ProdutoCategoriaDAOTest() {
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ProdutoCategoriaDAO instance = new ProdutoCategoriaDAO();

        ArrayList<ProdutoCategoriaModel> result = instance.findAll();
        System.err.println(result.size());

        result.forEach(model -> {
            System.err.println(model.getId());
        });
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        ProdutoCategoriaDAO instance = new ProdutoCategoriaDAO();

        ProdutoCategoriaModel pcm = new ProdutoCategoriaModel("TESTE");

        instance.insert(pcm);
        
    }

}
