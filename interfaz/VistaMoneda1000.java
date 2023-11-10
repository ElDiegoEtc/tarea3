package interfaz;
import javax.swing.*;
import java.awt.*;

import tarea3.*;
/**
 * Esta clase extiende la clase VistaMoneda y representa la interfaz gráfica
 * para visualizar una moneda de valor 1000.
 */
public class VistaMoneda1000 extends VistaMoneda {
    private Moneda1000 moneda;

    /**
     * Constructor de la clase VistaMoneda1000 que toma un objeto Moneda1000 como parámetro.
     *
     * @param moneda Objeto Moneda1000 que se usará para representar la moneda en la vista.
     */
    public VistaMoneda1000(Moneda1000 moneda) {
        super(moneda);
        this.moneda = moneda;
    }

    /**
     * Método que dibuja la representación gráfica de la moneda de valor 1000 en el componente gráfico.
     *
     * @param g Objeto Graphics que se utiliza para dibujar la moneda.
     */
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.fillOval(10, 10, 30, 30);
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.valueOf(moneda.getValor()), 25, 28);
    }
}
