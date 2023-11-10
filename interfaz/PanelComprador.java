package interfaz;
import javax.swing.*;
import java.awt.*;

/**
 * Esta clase representa un panel para un comprador, que muestra la interfaz gráfica para generar monedas y realizar compras.
 */
public class PanelComprador extends JPanel {

    JLabel texto = new JLabel("Moneda: "); // Etiqueta para mostrar texto
    JTextField ingresar = new JTextField(4); // Campo de texto para ingresar datos
    JButton generar = new JButton("Generar Moneda"); // Botón para generar la moneda

    /**
     * Constructor de la clase PanelComprador. Inicializa y agrega los componentes gráficos al panel.
     */
    public PanelComprador() {
        add(texto); // Agrega la etiqueta al panel
        add(ingresar); // Agrega el campo de texto al panel
        add(generar); // Agrega el botón al panel
    }

    /**
     * Método para pintar en el panel.
     *
     * @param g Objeto Graphics en el que se realizará el dibujo.
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 50, 300, 500); // Dibuja un rectángulo en el panel
    }
}

