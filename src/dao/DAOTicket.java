/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Jornada;

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
