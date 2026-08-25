package interfaces;

import modelo.Jornada;

/**
 *
 * @author estudiantes
 */
public interface IVistaPrincipal extends IVista {
    public static final String BTN_VISTA_TICKET = "BTN_VISTA_TICKET";
    
    public void inicializar(Jornada jornada);
    public void cargarTickets(Jornada jornada);
}
