package interfaz;
import javax.swing.*;
import java.awt.*;

/**
 * Esta clase representa un panel para un comprador, que muestra la interfaz gráfica para generar monedas y realizar compras.
 */
public class PanelComprador extends JPanel {

    JLabel texto = new JLabel("Moneda: ");
    JTextField ingresar = new JTextField(4);
    JButton generar = new JButton("Generar Moneda");

    /**
     * Constructor de la clase PanelComprador. Inicializa y agrega los componentes gráficos al panel.
     */
    public PanelComprador() {
        add(texto);
        add(ingresar);
        add(generar);
    }

    /**
     * Método para pintar en el panel.
     *
     * @param g Objeto Graphics en el que se realizará el dibujo.
     */
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 50, 300, 500);
    }
}

