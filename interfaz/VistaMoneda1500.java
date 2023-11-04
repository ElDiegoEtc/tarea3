package interfaz;
import javax.swing.*;
import java.awt.*;

import tarea3.*;
public class VistaMoneda1500 extends VistaMoneda {
    private Moneda1500 moneda;

    public VistaMoneda1500(Moneda1500 moneda) {
        super(moneda);
        this.moneda = moneda;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Aquí puedes personalizar la representación gráfica de la moneda de 1500
        // Puedes añadir código específico para la representación de la Moneda1500
    }
}