package interfaz;

import tarea3.CocaCola;
import tarea3.Super8;

import java.awt.*;

/**
 * Esta clase es responsable de dibujar una forma específica que representa un "Super8" en un contexto gráfico.
 */
public class Super8vista {

    /**
     * Constructor por defecto de la clase Super8vista.
     */
    public Super8vista(){

    }

    /**
     * Método encargado de pintar la representación gráfica de un "Super8".
     *
     * @param g Objeto Graphics en el que se dibujará la forma del "Super8".
     */
    public void paint(Graphics g, Super8 s8, int x, int y){
        g.setColor(Color.yellow);
        g.fillRect (x, y, 10, 15);
    }
}
