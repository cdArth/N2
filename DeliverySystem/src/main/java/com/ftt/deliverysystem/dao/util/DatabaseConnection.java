package com.ftt.deliverysystem.dao.util;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class DatabaseConnection {

    private static DatabaseConnection uniqueInstance;
    private static Connection connection;

    public static synchronized DatabaseConnection getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DatabaseConnection();
        }

        connection = getConnection();

        return uniqueInstance;
    }

    private static Connection createConnection() {
        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;instanceName=sql1;"
                + "database=6BI_N2;"
                + "user=dbuser;"
                + "password=dbuser@123;";

        try  {
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.err.println("hora da consulta"); 
            return connection;
        } // Handle any errors that may have occurred.
        catch (Exception e) {
            System.err.println("erro na conexão com o banco");
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed() == true) {
                connection = createConnection();
            }
        } catch (SQLServerException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public static ResultSet query(String queryString) {
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(queryString);
            return preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
