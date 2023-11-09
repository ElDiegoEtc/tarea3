package interfaz;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DepositosVista<T> extends JPanel{
    private JList<T> objetos;
    private DefaultListModel<T> modelo;

    public DepositosVista(ArrayList<T> deposito){
        objetos = new JList<T>();
        modelo = new DefaultListModel<>();
        for (T item : deposito) {
            modelo.addElement(item);
        }
        add(objetos);
    }
    public void paintComponent(Graphics g){
        super.paint(g);
        g.fillRect(40, 50, 30, 30);
    }
}
