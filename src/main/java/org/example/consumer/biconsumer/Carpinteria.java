package org.example.consumer.biconsumer;

import java.util.function.BiConsumer;

public class Carpinteria {
    public static void main(String[] args) {

        double precioPorMetroCuadrado = 5650.0;
        double area = 10.0;
        BiConsumer<Double, Double> calcularCosto = (precio, areaTotal) -> {
            double costo = precio * areaTotal;
            System.out.println("El costo total del pedido es: $" + costo);
        };


        calcularCosto.accept(precioPorMetroCuadrado, area);

    }
}
