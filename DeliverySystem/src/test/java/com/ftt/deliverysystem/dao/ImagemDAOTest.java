/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.models.ImagemModel;
import java.io.File;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lukas
 */
public class ImagemDAOTest {
    
    public ImagemDAOTest() {
    }
    
    @Test
    public void insertSomeImages() {
        ImagemDAO dao = new ImagemDAO();
        
        String path = "src/img/cerveja.jpeg";
        System.out.println(new File(path).getAbsolutePath());
        ImagemModel i = new ImagemModel(path);
        
        dao.insert(i);
    }
    
}
