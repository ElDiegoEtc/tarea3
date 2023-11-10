package interfaz;

import tarea3.CocaCola;
import tarea3.Snicker;

import java.awt.*;

/**
 * Esta clase se encarga de dibujar la representación gráfica de un objeto que simula un "Snickervista".
 */
public class Snickervista {
    /**
     * Constructor por defecto de la clase Snickervista.
     */
    public Snickervista() {

    }

    /**
     * Método encargado de pintar la representación gráfica del "Snickervista".
     *
     * @param g Objeto Graphics donde se realizará el dibujo del objeto "Snickervista".
     */
    public void paint(Graphics g, Snicker s, int x, int y){
        g.setColor(Color.black);
        g.fillRect (x, y, 10, 15);
    }
}
