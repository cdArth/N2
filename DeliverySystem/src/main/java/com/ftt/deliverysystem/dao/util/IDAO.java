/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao.util;

import com.ftt.deliverysystem.models.util.Model;
import java.util.ArrayList;

/**
 *
 * @author lukas
 */
public interface IDAO {

    void delete(Model model);

    Model find(int id);

    @SuppressWarnings(value = "rawtypes")
    ArrayList findAll();

    Model insert(Model model);

    Model update(Model model);
    
}
