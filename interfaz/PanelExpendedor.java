package interfaz;
import javax.swing.*;
import tarea3.Expendedor;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private Expendedor e;
    public PanelExpendedor(){

    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.gray);
        g.fillRect(10, 30, 100, 120);

        DepositosVista.paint();

    }
}
