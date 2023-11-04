package interfaz;
import tarea3.*;
import javax.swing.*;
import java.awt.*;
// VistaMoneda500.java - Vista para representar gráficamente una moneda de 500
public class VistaMonedaa500 extends VistaMoneda {
    private Moneda500 moneda;

    public VistaMonedaa500(Moneda500 moneda) {
        super(moneda);
        this.moneda = moneda;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Aquí puedes personalizar la representación gráfica de la moneda de 500
        // Puedes añadir código específico para la representación de la Moneda500
    }
}