package interfaz;
import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {

    JLabel texto = new JLabel("Moneda: ");
    JTextField ingresar = new JTextField(4);
    JButton generar = new JButton("Generar Moneda");
    public PanelComprador(){
        add(texto);
        add(ingresar);
        add(generar);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0, 50, 300, 500);

    }
}

