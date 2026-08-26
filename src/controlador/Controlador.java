package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interfaces.IVistaAddTicket;
import interfaces.IVistaPrincipal;
import modelo.Auto;
import modelo.Jornada;
import modelo.Ticket;
import vistas.VistaAddTicket;
import vistas.VistaPrincipal;

/**
 *
 * @author estudiantes
 */
public class Controlador implements ActionListener {
    private final Jornada jornada = new Jornada();
    private IVistaPrincipal vistaPrincipal = new VistaPrincipal();
    private IVistaAddTicket vistaAddTicket = new VistaAddTicket(null, true);

    public void inicializar() {
        cargarDatosPrueba();
        
        vistaPrincipal.setControlador(this);
        vistaAddTicket.setControlador(this);

        vistaPrincipal.inicializar(this.jornada);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void cargarDatosPrueba(){
        this.jornada.agregar(new Ticket(new Auto("UTN 123"), 5));
    }
}
