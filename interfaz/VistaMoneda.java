package interfaz;

import javax.swing.*;
import java.awt.*;

import tarea3.*;

// VistaMoneda.java - Vista para representar gráficamente una moneda
public class VistaMoneda extends JPanel {
    private Moneda moneda;

    public VistaMoneda(Moneda moneda) {
        this.moneda = moneda;
        setPreferredSize(new Dimension(50, 50)); // Tamaño del panel para la moneda
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la representación gráfica de la moneda
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(moneda.getColor());
        g2d.fillOval(10, 10, 30, 30);
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.valueOf(moneda.getValor()), 25, 28);
    }
}