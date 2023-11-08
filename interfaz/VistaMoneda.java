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

}