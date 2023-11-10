package interfaz;

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
    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(10, 30, 50, 50);
    }
}
