package tarea3;
import javax.swing.*;
import interfaz.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Expendedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelExpendedor panelExpendedor = new PanelExpendedor();
        frame.add(panelExpendedor);
        frame.setSize(550, 600);
        frame.setVisible(true);
    }
}
 /*
    public static void main(String[] args) {

        JFrame frame = new JFrame("PanelExpendedor");
PanelPrincipal p1=new PanelPrincipal();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setContentPane(p1);

        frame.setVisible(true);
 */