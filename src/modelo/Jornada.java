package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiantes
 */
public class Jornada {
    private List<Ticket> tickets = new ArrayList<>();
    private LocalDate fecha;
    private double total;

    public Jornada() {
        this.fecha = LocalDate.now();
        this.total = 0;
    }

    public void agregar(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public double calcularTotal() {
        double total = 0;
        for (Ticket t : this.tickets) {
            total += t.calcular();
        }
        return total;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
