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
        // Aquí puedes personalizar la representación gráfica de la moneda de 1000
        // Puedes añadir código específico para la representación de la Moneda1000
    }
}
