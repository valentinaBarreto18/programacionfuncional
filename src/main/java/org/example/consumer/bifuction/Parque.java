package org.example.consumer.bifuction;

import javax.swing.*;
import java.util.function.BiFunction;

public class Parque {
    public static void main(String[] args) {
        BiFunction<Double, String, Double> calcularCostoAlquiler = (area, juegosSeleccionados) -> {
            double costoBasePorMetroCuadrado = 500;
            double costoTotal = costoBasePorMetroCuadrado * area;

            if (juegosSeleccionados.contains("Tobogán")) {
                costoTotal += 5000;

            }
            if (juegosSeleccionados.contains("Columpio")) {
                costoTotal += 3000;
            }
            if (juegosSeleccionados.contains("Trampolín")) {
                costoTotal += 6500;

            }
            return costoTotal;
        };

        String inputLargo = JOptionPane.showInputDialog("Ingrese el largo del espacio en metros:");
        double largo = Double.parseDouble(inputLargo);

        String inputAncho = JOptionPane.showInputDialog("Ingrese el ancho del espacio en metros:");
        double ancho = Double.parseDouble(inputAncho);

        double area = largo * ancho;
        String juegos = JOptionPane.showInputDialog(
                "Seleccione los juegos para incluir en el espacio (separados por comas):\n" +
                        "- Tobogán\n" +
                        "- Columpio\n" +
                        "- Trampolín\n" +
                        "Ejemplo: Tobogán, Columpio"
        );
        double costoTotal = calcularCostoAlquiler.apply(area, juegos);
        JOptionPane.showMessageDialog(null, "El costo total del alquiler es: $" + costoTotal);
    }
    }
