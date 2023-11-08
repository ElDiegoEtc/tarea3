package interfaz;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    //se ve en el centro de la ventana

    private PanelComprador com;
    //private PanelExpendedor exp;

    public PanelPrincipal() {
       // exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.blue);
        add(com);
    }

    public void paint(Graphics g) { //todo se dibuja a partir de este método
        super.paint(g); //llama al método pint al que hace override en la superclase
        //el de la super clase solo pinta el fondo (background)
        com.paint(g); //llama al metodo paint definido en el PanelComprador
        //exp.paint(g); //llama al metodo paint definido en el PanelExpendedor
    }
}
