package interfaz;

import javax.swing.*;
import java.awt.*;

import tarea3.*;


/**
 * Esta clase es una extensión de JPanel y sirve como base para la representación gráfica de una moneda genérica.
 */
public class VistaMoneda extends JPanel {
    private Moneda moneda;

    /**
     * Constructor de la clase VistaMoneda que toma un objeto Moneda como parámetro.
     *
     * @param moneda Objeto Moneda que se usará para representar la moneda en la vista.
     */
    public VistaMoneda(Moneda moneda) {
        this.moneda = moneda;
        setPreferredSize(new Dimension(50, 50));
    }
}
