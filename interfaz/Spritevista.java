package interfaz;

import tarea3.CocaCola;
import tarea3.Sprite;

import java.awt.*;

/**
 * Esta clase se encarga de representar gráficamente un sprite genérico en un contexto gráfico.
 */
public class Spritevista {
    /**
     * Constructor por defecto de la clase Spritevista.
     */
    public Spritevista() {

    }

    /**
     * Método que pinta la representación gráfica del sprite.
     *
     * @param g Objeto Graphics en el que se dibujará el sprite.
     */
    public void paint(Graphics g, Sprite s, int x, int y){
        g.setColor(Color.white);
        g.fillRect (x, y, 10, 15);
    }
}
