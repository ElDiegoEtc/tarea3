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
    public void paint(Graphics g, Sprite s, int x, int y) {
        g.setColor(Color.white);
        g.fillRect(x, y, 15, 40);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.green);
        g2d.setFont(new Font("Arial", Font.PLAIN, 10));

        g2d.rotate(Math.toRadians(-90), x + 15 / 2, y + 40 / 2);

        String texto = "Sprite";
        int textoWidth = g2d.getFontMetrics().stringWidth(texto);
        int textoHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(texto, x + (15 - textoWidth) / 2, y + 40 / 2 + textoHeight / 2);

        g2d.dispose();
    }
}

