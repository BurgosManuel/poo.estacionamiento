package controlador;

import dao.Conector;
import dao.DAOTicket;
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
    private Conector conector = new Conector();
    private DAOTicket daoTicket = new DAOTicket(conector, jornada);

    public void inicializar() {
        daoTicket.cargarTickets();
        
        vistaPrincipal.setControlador(this);
        vistaAddTicket.setControlador(this);

        vistaPrincipal.inicializar(this.jornada);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(IVistaPrincipal.BTN_VISTA_TICKET.equalsIgnoreCase(e.getActionCommand())) {
            vistaAddTicket.inicializar();
        }
        
        if(IVistaAddTicket.BTN_ADD_TICKET.equalsIgnoreCase(e.getActionCommand())) {
            Ticket nuevoTicket = vistaAddTicket.agregarTicket();
            this.jornada.agregar(nuevoTicket);
            this.daoTicket.agregarTicket(nuevoTicket);
            
            vistaPrincipal.cargarTickets(jornada);
        }
    }
    
    private void cargarDatosPrueba(){
        this.jornada.agregar(new Ticket(new Auto("UTN 123"), 5));
    }
}
