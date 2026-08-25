package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interfaces.IVistaAddTicket;
import interfaces.IVistaPrincipal;
import modelo.Jornada;
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
        vistaPrincipal.setControlador(this);
        vistaAddTicket.setControlador(this);

        vistaPrincipal.inicializar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
