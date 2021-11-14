/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ftt.deliverysystem;

import com.ftt.deliverysystem.dao.util.DatabaseConnection;

/**
 *
 * @author lukas
 */
public class DeliverySystem {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      System.err.println("iniciando a aplicação...");
      
      DatabaseConnection databaseConnection = new DatabaseConnection();
      if(databaseConnection.getConnection() == null) {
          System.err.println("Parece que deu ruim...");
      }
  }
}
