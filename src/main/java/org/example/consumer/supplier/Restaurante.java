package org.example.consumer.supplier;

import javax.swing.*;
import java.time.LocalTime;
import java.util.function.Supplier;

public class Restaurante {
    public static void main(String[] args) {


    Supplier<String> sugerirPlatillo = () -> {
        LocalTime horaActual = LocalTime.now();
        if (horaActual.isBefore(LocalTime.NOON)) {
            return "Desayuno especial: Omelette con jugo de naranja";
        } else if (horaActual.isBefore(LocalTime.of(18, 0))) {
            return "Almuerzo especial: Pollo al horno con ensalada y arroz";
        } else {
            return " Cena Especial chocolate con pan y queso";
        }
    };
    String platilloSugerido = sugerirPlatillo.get();
        JOptionPane.showMessageDialog(null, "Sugerencia del platillo: " + platilloSugerido);
}
}