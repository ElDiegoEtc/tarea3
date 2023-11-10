package interfaz;

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
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(20, 70, 60, 70);
    }
}
