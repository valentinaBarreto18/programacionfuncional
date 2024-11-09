package org.example.consumer.consumer;

import javax.swing.*;
import java.util.function.Consumer;

public class Peluqueria {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("ingrese el nombre del cliente:");
        String servicio = JOptionPane.showInputDialog("ingrese el servicio que desea adquirir:");
        double totalPagar = Double.parseDouble(JOptionPane.showInputDialog("ingrese el total a pagar"));

        ClientePeluqueria cliente = new ClientePeluqueria(nombre,servicio,totalPagar);
        Consumer<ClientePeluqueria> aplicarDescuento = c -> {
            if ("corte de cabello".equalsIgnoreCase(c.getServicio())) {
                c.aplicarDescuento(20);
            } else if ("pedicure".equalsIgnoreCase(c.getServicio())) {
                c.aplicarDescuento(15);
            } else {
                c.aplicarDescuento(5);
            }
            JOptionPane.showMessageDialog(null, c.toString());
        };
        aplicarDescuento.accept(cliente);

    }
}
