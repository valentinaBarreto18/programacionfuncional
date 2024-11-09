package org.example.consumer.biconsumer;

public class Huesped {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Huesped(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;


    }

    @Override
    public String toString() {
        return "Huesped{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
