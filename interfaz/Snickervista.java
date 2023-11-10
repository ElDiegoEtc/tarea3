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
        g.fillRect (x, y, 15, 40);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.red);
        g2d.setFont(new Font("Arial", Font.PLAIN, 10));

        g2d.rotate(Math.toRadians(-90), x + 15 / 2, y + 40 / 2);

        String texto = "Snicker";
        int textoWidth = g2d.getFontMetrics().stringWidth(texto);
        int textoHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(texto, x + (15 - textoWidth) / 2, y + 40 / 2 + textoHeight / 2);

        g2d.dispose();
    }
}
