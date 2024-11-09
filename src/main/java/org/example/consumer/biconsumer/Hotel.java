package org.example.consumer.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Hotel {
    public static void main(String[] args) {
        Map<Integer, Huesped> habitaciones = new HashMap<>();

        BiConsumer<Integer, Huesped> asignarHabitacion = (numeroHabitacion, huesped) -> {
            habitaciones.put(numeroHabitacion, huesped);
            System.out.println("Habitación " + numeroHabitacion + " asignada a " + huesped.getNombre() + ".");
            System.out.println("Bienvenido(a), " + huesped.getNombre() + "! Esperamos que disfrute de su estancia.");
        };

        Huesped huesped1 = new Huesped("Xiomara", 28);
        Huesped huesped2 = new Huesped("Sofia", 23);

        asignarHabitacion.accept(101, huesped1);
        asignarHabitacion.accept(102, huesped2);

        System.out.println("\nAsignaciones de habitaciones:");
        habitaciones.forEach((habitacion, huesped) -> {
            System.out.println("Habitación " + habitacion + ": " + huesped);
        });
    }
    }