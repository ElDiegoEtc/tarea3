package interfaz;

import tarea3.CocaCola;

import java.awt.*;

public class CocaColavista {
    public CocaColavista(){

    }
    public void paint(Graphics g, CocaCola coca, int x, int y){
        g.setColor(Color.red);
        g.fillRect (x, y, 15, 40);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.PLAIN, 8));

        g2d.rotate(Math.toRadians(-90), x + 15 / 2, y + 40 / 2);

        String texto = "CocaCola";
        int textoWidth = g2d.getFontMetrics().stringWidth(texto);
        int textoHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(texto, x + (15 - textoWidth) / 2, y + 40 / 2 + textoHeight / 2);

        g2d.dispose();
    }
}
