package interfaz;

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
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(20, 10, 50, 50);
    }
}
