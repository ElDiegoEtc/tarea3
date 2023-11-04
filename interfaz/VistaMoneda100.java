package interfaz;
import tarea3.*;
import javax.swing.*;
import java.awt.*;
// VistaMoneda100.java - Vista para representar gráficamente una moneda de 100
public class VistaMoneda100 extends VistaMoneda {
    private Moneda100 moneda;

    public VistaMoneda100(Moneda100 moneda) {
        super(moneda);
        this.moneda = moneda;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(10, 10, 30, 30);
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.valueOf(moneda.getValor()), 25, 28);
    }
}