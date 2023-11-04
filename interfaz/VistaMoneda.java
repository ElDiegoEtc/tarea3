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
        // Dibujar la representación gráfica de la moneda con el color respectivo
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(moneda.getColor()); // Establece el color desde la moneda
        g2d.fillOval(10, 10, 30, 30); // Dibuja un círculo como representación de la moneda
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.valueOf(moneda.getValor()), 25, 28); // Muestra el valor de la moneda en el centro
    }
}
