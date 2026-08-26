/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mburgos
 */
public class Conexion {
    private final String username = "mburgos";
    private final String pass = "";
    private final String url = "jdbc:mariadb://localhost:3306/estacionamiento";
    private Connection connection;
    private Statement statement;
    
    public void conectar() {
        String driver = "org.mariadb.jdbc.Driver";
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url);
            this.statement = connection.createStatement();
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
