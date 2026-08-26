package modelo;

/**
 *
 * @author estudiantes
 */
public class Camioneta extends Vehiculo {

    public Camioneta() {
        setPrecioHora(3500);
    }
    
    public Camioneta(String patente) {
        super(patente, 3500);
    }
}
