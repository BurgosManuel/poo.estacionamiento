/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import modelo.Jornada;
import modelo.Ticket;

/**
 *
 * @author mburgos
 */
public class DAOTicket {
    private Conector conector;
    private Jornada jornada;
    
    public DAOTicket(Conector conector, Jornada jornada) {
        this.conector = conector;
        this.jornada = jornada;
    };
    
    public void cargarTickets() {
        try(Connection connection = conector.getConexion()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM ticket");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                String patente = rs.getString("patente");
                String tipoVehiculo = rs.getString("tipo_vehiculo");
                LocalDateTime horaIngreso = rs.getObject("hora_ingreso", LocalDateTime.class);
                LocalDateTime horaSalida = rs.getObject("hora_salida", LocalDateTime.class);
                int cantidadHoras = rs.getInt("cantidad_horas");
                double total = rs.getDouble("total");
                
                Ticket t = new Ticket();
                t.setVehiculo(patente, tipoVehiculo);
                t.setHoraIngreso(horaIngreso);
                t.setHoraSalida(horaSalida);
                t.setCantidadHoras(cantidadHoras);
                t.setTotal(total);
                
                jornada.agregar(t);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public Conector getConector() {
        return conector;
    }

    public void setConector(Conector conector) {
        this.conector = conector;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
    
    
}
