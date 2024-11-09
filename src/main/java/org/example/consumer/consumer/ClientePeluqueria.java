package org.example.consumer.consumer;

public class ClientePeluqueria {
    private String nombre;
    private String servicio;
    private double totalPagar;

    public ClientePeluqueria(String nombre, String servicio, double totalPagar) {
        this.nombre = nombre;
        this.servicio = servicio;
        this.totalPagar = totalPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getServicio() {
        return servicio;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void aplicarDescuento(double porcentaje){
        this.totalPagar -= this.totalPagar *(porcentaje/100);

    }

    @Override
    public String toString() {
        return "ClientePeluqueria{" +
                "nombre='" + nombre + '\'' +
                ", servicio='" + servicio + '\'' +
                ", totalPagar=" + totalPagar +
                '}';
    }
}
