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
        g.fillRect (x, y, 15, 40);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.blue);
        g2d.setFont(new Font("Arial", Font.PLAIN, 10));

        g2d.rotate(Math.toRadians(-90), x + 15 / 2, y + 40 / 2);

        String texto = "Fanta";
        int textoWidth = g2d.getFontMetrics().stringWidth(texto);
        int textoHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(texto, x + (15 - textoWidth) / 2, y + 40 / 2 + textoHeight / 2);

        g2d.dispose();
    }
}
