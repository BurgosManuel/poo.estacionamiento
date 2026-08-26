package modelo;

/**
 *
 * @author estudiantes
 */
public class Moto extends Vehiculo {

    public Moto() {
        setPrecioHora(1000);
    }
    
    public Moto(String patente) {
        super(patente, 1000);
    }
}
