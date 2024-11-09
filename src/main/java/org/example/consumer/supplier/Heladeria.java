package org.example.consumer.supplier;

import javax.swing.*;
import java.util.Random;
import java.util.function.Supplier;

public class Heladeria {
    public static void main(String[] args) {
        String[] sabores = {"vainilla", "chocolate", "fresa","limon"};

        Supplier<String> obtenerSaborAleatorio = ()-> {
            Random random = new Random();
            int index = random.nextInt(sabores.length);
            return sabores[index];
        };

        String saborelegido = obtenerSaborAleatorio.get();
        JOptionPane.showMessageDialog(null,"sabor de helado elegido:" + saborelegido);
    }
}
