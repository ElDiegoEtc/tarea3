package tarea3;
import javax.swing.*;
import interfaz.*;

import interfaz.PanelPrincipal;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problema103 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Expendedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelExpendedor panelExpendedor = new PanelExpendedor();
        frame.add(panelExpendedor);
        frame.setSize(550, 600);
        frame.setVisible(true);
    }
}
 /*
    public static void main(String[] args) {

        JFrame frame = new JFrame("PanelExpendedor");
PanelPrincipal p1=new PanelPrincipal();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setContentPane(p1);

        frame.setVisible(true);

        /*
        Expendedor exp = new Expendedor(2);
        Comprador c;
        Moneda m;
        m = new Moneda1000();
        c = new Comprador(m, 2, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
         */
   /* }
}
*/
