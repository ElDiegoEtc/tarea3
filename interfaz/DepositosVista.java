package interfaz;

import tarea3.*;

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
        int x = 310;

        // Iterar sobre los elementos de la lista y dibujarlos
        for (int i = 0; i < modelo.getSize(); i++) {
            T item = modelo.getElementAt(i);
            if (item instanceof CocaCola) {
                int y = 70;
                CocaCola cocaCola = (CocaCola) item;
                CocaColavista cocaVista = new CocaColavista();
                cocaVista.paint(g, cocaCola, x, y);
            } else if(item instanceof Sprite) {
                int y = 110;
                Sprite sprite = (Sprite) item;
                Spritevista svista = new Spritevista();
                svista.paint(g, sprite, x, y);
            } else if(item instanceof Fanta) {
                int y = 150;
                Fanta fanta = (Fanta) item;
                Fantavista fvista = new Fantavista();
                fvista.paint(g, fanta, x, y);
            } else if(item instanceof Snicker) {
                int y = 190;
                Snicker snicker = (Snicker) item;
                Snickervista snvista = new Snickervista();
                snvista.paint(g, snicker, x, y);
            } else if(item instanceof Super8) {
                int y = 230;
                Super8 suuper8 = (Super8) item;
                Super8vista s8vista = new Super8vista();
                s8vista.paint(g, suuper8, x, y);
            } else if(item instanceof Moneda100) {
                 int y = 500;
                 Moneda100 cien = (Moneda100) item;
                 VistaMoneda100 cienvista = new VistaMoneda100(cien);
                 cienvista.paint(g, cien, x, y);
            }

            // Ajustar las coordenadas para el próximo elemento
            x += 18; // Puedes ajustar esto según sea necesario
        }
    }
}
