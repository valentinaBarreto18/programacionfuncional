package org.example.consumer.Fuction;

import javax.swing.*;
import java.util.function.Function;

public class Hospital {
    public static void main(String[] args) {

        Function<Double, Double> calcularDosis = peso -> peso * 10;
        String input = JOptionPane.showInputDialog("Ingrese el peso del paciente en kg:");
        double peso = Double.parseDouble(input);
        double dosisRecomendada = calcularDosis.apply(peso);
        JOptionPane.showMessageDialog(null, "Dosis recomendada: " + dosisRecomendada + " mg");
    }
    }

