package interfaz;

import tarea3.DepositoGenerico;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DepositosVista<T> extends JPanel{
    private JList<T> objetos;
    private DefaultListModel<T> modelo;
    private ArrayList<T> array;

    public DepositosVista(DepositoGenerico<T> deposito){
        array = deposito.getArray();
        objetos = new JList<T>();
        modelo = new DefaultListModel<>();
        for (T item : array) {
            modelo.addElement(item);
        }
        objetos.setModel(modelo);
        add(objetos);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Coordenadas iniciales para dibujar los elementos
        int x = 330;
        int y = 300;

        // Iterar sobre los elementos de la lista y dibujarlos
        for (int i = 0; i < modelo.getSize(); i++) {
            T item = modelo.getElementAt(i);

            // Dibujar el nombre del elemento en la posición actual
            g.drawString(item.toString(), x, y);

            // Ajustar las coordenadas para el próximo elemento
            y += 20; // Puedes ajustar esto según sea necesario
        }
    }
}
