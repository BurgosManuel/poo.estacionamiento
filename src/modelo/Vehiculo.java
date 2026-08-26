package modelo;

/**
 *
 * @author estudiantes
 */
public class Vehiculo {
    private String patente;
    private double precioHora;
    
    public Vehiculo() {
        
    }
    
    public Vehiculo(String patente, double precioHora) {
        this.patente = patente;
        this.precioHora = precioHora;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
}
