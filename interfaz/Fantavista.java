package interfaz;

import tarea3.CocaCola;
import tarea3.Fanta;

import java.awt.*;

/**
 * Esta clase se encarga de representar gráficamente un objeto que simula un "Fanta" en un contexto gráfico.
 */
public class Fantavista {
    /**
     * Constructor por defecto de la clase Fantavista.
     */
    public Fantavista() {

    }

    /**
     * Método encargado de pintar la representación gráfica del objeto "Fanta".
     *
     * @param g Objeto Graphics en el que se dibujará el objeto "Fanta".
     */
    public void paint(Graphics g, Fanta fanta, int x, int y){
        g.setColor(Color.orange);
        g.fillRect (x, y, 10, 15);
    }
}
