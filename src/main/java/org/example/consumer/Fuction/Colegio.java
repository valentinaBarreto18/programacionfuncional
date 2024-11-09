package org.example.consumer.Fuction;

import javax.swing.*;
import java.util.function.Function;

public class Colegio {
    public static void main(String[] args) {
        Function<Double, String> calcularNotaFinal = promedio -> {
            if (promedio >= 90) {
                return "A";
            } else if (promedio >= 80) {
                return "B";
            } else if (promedio >= 70) {
                return "C";
            } else if (promedio >= 60) {
                return "D";
            } else {
                return "F";
            }
        };

        String input = JOptionPane.showInputDialog("Ingrese el promedio del estudiante:");
        double promedio = Double.parseDouble(input);

        String notaFinal = calcularNotaFinal.apply(promedio);
        JOptionPane.showMessageDialog(null, "La nota final del estudiante es: " + notaFinal);
    }
}
