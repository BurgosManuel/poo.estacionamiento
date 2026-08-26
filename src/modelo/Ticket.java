package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author estudiantes
 */
public class Ticket {
    private Vehiculo vehiculo;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private int cantidadHoras;
    private double total;
    
    public Ticket() {
        this.horaIngreso = LocalDateTime.now();
    }
    
    public Ticket(Vehiculo v, int cantidadHoras) {
        this.vehiculo = v;
        this.horaIngreso = LocalDateTime.now();
        this.cantidadHoras = cantidadHoras;
        this.horaSalida = this.horaIngreso.plusHours(cantidadHoras);
        this.total = this.calcular();
    }

    public double calcular() {
        return this.cantidadHoras * vehiculo.getPrecioHora();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void setVehiculo(String patente, String tipoVehiculo) {
        switch(tipoVehiculo) {
            case "MOTO":
                setVehiculo(new Moto(patente));
                break;
            case "AUTO":
                setVehiculo(new Auto(patente));
                break;
            case "CAMIONETA":
                setVehiculo(new Camioneta(patente));
                break;
        }
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
        if(null != this.horaIngreso) {
         this.horaSalida = this.horaIngreso.plusHours(cantidadHoras); // Alineamos hora de salida y cant. horas   
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
