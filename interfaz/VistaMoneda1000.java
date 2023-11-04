package interfaz;
import javax.swing.*;
import java.awt.*;

import tarea3.*;
public class VistaMoneda1000 extends VistaMoneda {
    private Moneda1000 moneda;

    public VistaMoneda1000(Moneda1000 moneda) {
        super(moneda);
        this.moneda = moneda;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.fillOval(10, 10, 30, 30);
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.valueOf(moneda.getValor()), 25, 28);
    }
}