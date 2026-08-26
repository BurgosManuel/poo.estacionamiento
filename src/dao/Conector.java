/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mburgos
 */
public class Conector {
    private final String username = "mburgos";
    private final String pass = "";
    private final String url = "jdbc:mariadb://localhost:3306/estacionamiento";
    private Connection connection;
    
    public Connection getConexion() {
        if(null != connection) {
            return connection;
        }
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, pass);
            System.out.println("Conexion exitosa.");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
}
