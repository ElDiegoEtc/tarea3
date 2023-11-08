package tarea3;
import javax.swing.*;
import interfaz.PanelPrincipal;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problema103 {
    public static void main(String[] args) {

        PanelPrincipal panel = new PanelPrincipal();
        JFrame frame = new JFrame("a");

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        /*
        Expendedor exp = new Expendedor(2);
        Comprador c;
        Moneda m;
        m = new Moneda1000();
        c = new Comprador(m, 2, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
         */
    }
}


