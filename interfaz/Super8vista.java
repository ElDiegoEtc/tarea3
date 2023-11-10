package interfaz;

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
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect (20, 70, 40, 80);
    }
}
