package interfaz;

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
        g.setColor(Color.black);
        g.fillRect (x, y, 15, 40);


        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.yellow);
        g2d.setFont(new Font("Arial", Font.PLAIN, 10));

        g2d.rotate(Math.toRadians(-90), x + 15 / 2, y + 40 / 2);

        String texto = "Super 8";
        int textoWidth = g2d.getFontMetrics().stringWidth(texto);
        int textoHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(texto, x + (15 - textoWidth) / 2, y + 40 / 2 + textoHeight / 2);

        g2d.dispose();
    }
}
