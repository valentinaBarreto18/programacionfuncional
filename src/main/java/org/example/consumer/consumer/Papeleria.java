package org.example.consumer.consumer;

import javax.swing.*;
import java.util.function.Consumer;

public class Papeleria {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("ingrese el nombre del producto");
        double precio= Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto"));
        ProductoPapeleria producto = new ProductoPapeleria(nombre,precio);

        Consumer<ProductoPapeleria> mostrarDetalles = p -> JOptionPane.showMessageDialog(null, p.toString());
        mostrarDetalles.accept(producto);
    }
}
