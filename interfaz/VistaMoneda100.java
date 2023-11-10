package interfaz;
import tarea3.*;
import javax.swing.*;
import java.awt.*;

/**
 * Esta clase extiende la clase VistaMoneda y representa la interfaz gráfica
 * para visualizar una moneda de valor 100.
 */
public class VistaMoneda100 extends VistaMoneda {
    private Moneda100 moneda;

    /**
     * Constructor de la clase VistaMoneda100 que toma un objeto Moneda100 como parámetro.
     *
     * @param moneda Objeto Moneda100 que se usará para representar la moneda en la vista.
     */
    public VistaMoneda100(Moneda100 moneda) {
        super(moneda);
        this.moneda = moneda;
    }

    /**
     * Método que dibuja la representación gráfica de la moneda de valor 100 en el componente gráfico.
     *
     * @param g Objeto Graphics que se utiliza para dibujar la moneda.
     */

    public void paint(Graphics g, CocaCola coca, int x, int y){
        g.setColor(Color.red);
        g.fillRect (x, y, 10, 15);
    }

    public void paint(Graphics g, Moneda100 m, int x, int y ) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, 30, 30);
        g2d.setColor(Color.BLACK);
        g2d.drawString(String.valueOf(moneda.getValor()), x+15, y+18);
    }
}
