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
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
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


    
}
