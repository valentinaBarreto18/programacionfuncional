package org.example.consumer.bifuction;

import javax.swing.*;
import java.util.function.BiFunction;

public class Piscina {
    public static void main(String[] args) {

        BiFunction<Integer, Double, Double> calcularCostoEntrada = (edad, horas) -> {
            double tarifaBase = 5000;
            if (edad < 12) {
                tarifaBase *= 8000;
            } else if (edad > 60) {
                tarifaBase *= 10000;

            }
            return tarifaBase * horas;

        };


        String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del visitante:");
        int edad = Integer.parseInt(inputEdad);

        String inputHoras = JOptionPane.showInputDialog("Ingrese el tiempo de permanencia en horas:");
        double horas = Double.parseDouble(inputHoras);

        double costoTotal = calcularCostoEntrada.apply(edad, horas);
        JOptionPane.showMessageDialog(null, "El costo total de la entrada es: $" + costoTotal);


    }
}
