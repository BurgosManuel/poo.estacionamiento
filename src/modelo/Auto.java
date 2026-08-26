package modelo;

/**
 *
 * @author estudiantes
 */
public class Auto extends Vehiculo {

    public Auto() {
        setPrecioHora(2500);
    }
    
    public Auto(String patente) {
        super(patente, 2500);
    }
}
