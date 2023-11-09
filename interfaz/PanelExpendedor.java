package interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PanelExpendedor extends JPanel {
    private JButton[] buttons;
    private int coinsInserted;
    private int productDeposit;

    public PanelExpendedor() {
        buttons = new JButton[6];
        coinsInserted = 0;
        productDeposit = 0;

       /* Ejecutar expendedor con 10 productos de cada deposito de producto
                crear interfaz de cada deposito de acuerdo a deposito vista


        if(Se hace click en panel expendedor){
            if(deposito 1 vacio){
                rellenar;
            }
            if(deposito 2 vacio){
                rellenar;
            }
            ....
        }*/

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
        }

        setLayout(null); // Establecer un diseño nulo para posicionar los componentes manualmente
        for (int i = 0; i < 6; i++) {
            int row = i < 3 ? 0 : 1;
            int col = i % 3;
            buttons[i].setBounds(50 + (col * 50), 50 + (row * 50), 50, 50); // Ajuste de la posición de los botones
            add(buttons[i]);
        }
        JButton InsertarMoneda = new JButton("Insertar Moneda");
        InsertarMoneda.setBounds(50, 370, 150, 30); // Posicionamiento del botón "Insertar Moneda"
        add(InsertarMoneda);
        JLabel titleLabel = new JLabel("Seleccione Producto", SwingConstants.CENTER);
        titleLabel.setBounds(50, 150, 150, 30); // Posicionamiento del título "Seleccione Producto"
        add(titleLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        // Dibujar el rectángulo que encierra todos los elementos del expendedor
        g.setColor(Color.BLACK);

        g.drawRect(40, 40, 470, 490);
        // Cambiar el color de fondo de los botones
        for (JButton button : buttons) {
            button.setBackground(Color.PINK);
        }
        // Dibujar la sección de monedas
        g.setColor(Color.BLACK);
        g.fillRect(50, 300, 150, 50);
        g.setColor(Color.BLACK);
        g.drawRect(50, 300, 150, 50);

        // Dibujar la sección de depósito de productos
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(50, 420, 150, 100);
        g.setColor(Color.BLACK);
        g.drawRect(50, 420, 150, 100);

        // Dibujar la sección del depósito de productos
        g.setColor(Color.CYAN);
        g.fillRect(300, 50, 200, 470);
        g.setColor(Color.BLACK);
        g.drawRect(300, 50, 200, 470);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Expendedor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelExpendedor panelExpendedor = new PanelExpendedor();
        frame.add(panelExpendedor);
        frame.setSize(550, 600);
        frame.setVisible(true);
    }
}
