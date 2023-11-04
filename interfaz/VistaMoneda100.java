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
        // Aquí puedes personalizar la representación gráfica de la moneda de 100
        // Puedes añadir código específico para la representación de la Moneda100
    }
}