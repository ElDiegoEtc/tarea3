package interfaz;
import tarea3.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tarea3.DepositoGenerico;
import tarea3.Expendedor;
import tarea3.Moneda;
public class PanelExpendedor extends JPanel {
    private JTextField cantidadMonedas;
    private JButton[] buttons;
    private JButton buttonComprar;
    private Label labelVuelto;
    private tarea3.Expendedor expendedor;
    private tarea3.Comprador comprador;
    private int eleccionProducto = -1;
    private tarea3.Moneda moneda;
    private DepositosVista<Producto> icoca, isprite, ifanta, isniker, isuper8, iDepositoEspecial;
    private DepositosVista<Moneda> imonedasVuelto, idepositoEspecialMonedas;
    /**
     * Constructor de la clase PanelExpendedor. Crea la interfaz gráfica para la interacción del expendedor.
     */
    public PanelExpendedor() {
/**
 * se crea la instancia de expendedor
 */
        expendedor = new tarea3.Expendedor(10);
        icoca = new DepositosVista<>(expendedor.getCocaDeposito());
        add(icoca);
        isprite = new DepositosVista<>(expendedor.getaSpriteDeposito());
        add(isprite);
        ifanta = new DepositosVista<>(expendedor.getFantaDeposito());
        add(ifanta);
        isniker = new DepositosVista<>(expendedor.getSnickerDeposito());
        add(isniker);
        isuper8 = new DepositosVista<>(expendedor.getSuper8Deposito());
        add(isuper8);
        //iDepositoEspecial = new DepositosVista<>(expendedor.getdepositoEspecialDeposito());
        //add(iDepositoEspecial);
        //imonedasVuelto = new DepositosVista<>(expendedor.getmonedasVueltoDeposito());
        //add(imonedasVuelto);
;
        /*
        if(Se hace click en panel expendedor){
            if(deposito 1 vacio){
                rellenar;
            }
            if(deposito 2 vacio){
                rellenar;
            }
            ....
        }*/
/**
 * se crea un texto para agregar las instrucciones de uso de la maquina
 */
        JTextArea instrucciones = new JTextArea();
        instrucciones.setText(
                "1. Ingrese la cantidad de monedas \n" +
                        "(100, 500, 1000, 1500). \n"+

        "2. Presione 'Insertar Moneda'.\n" +
                        "3. Seleccione el producto.\n" +
                        "4. Presione 'Comprar Producto'.\n" +
                        "5. Recoja su vuelto."
        );
        /**
         * Hace el área de texto transparente
         */
        instrucciones.setEditable(false);
        instrucciones.setOpaque(false);

        /**
         * Colocar las instrucciones en un panel con borde
         */
        JPanel panelInstrucciones = new JPanel(new BorderLayout());
        panelInstrucciones.add(instrucciones, BorderLayout.CENTER);
        panelInstrucciones.setBorder(BorderFactory.createTitledBorder("Instrucciones"));
        panelInstrucciones.setBounds(50, 420, 200, 100);

        add(panelInstrucciones);

/**
 * se crean los botones para comprar y el label de vuelto
 */
        buttonComprar = new JButton("Comprar");
        labelVuelto = new Label("Vuelto:");
        buttons = new JButton[6];
/**
 * se agregan los botones y se me asigna su seria
 */
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
        }

        setLayout(null);
        for (int i = 0; i < 6; i++) {
            int row = i < 3 ? 0 : 1;
            int col = i % 3;
            buttons[i].setBounds(50 + (col * 50), 50 + (row * 50), 50, 50);
            add(buttons[i]);
        }
/**
 * se crean y añaden los botones para insertar moneda, comprar y la seccion del vuelto
 * ademas se establecen sus medidas y ubicacion
 */
        JButton InsertarMoneda = new JButton("Insertar Moneda");
        InsertarMoneda.setBounds(50, 370, 150, 30);
        add(InsertarMoneda);
        JLabel titleLabel = new JLabel("Seleccione Producto", SwingConstants.CENTER);
        titleLabel.setBounds(50, 150, 150, 30);
        add(titleLabel);
        buttonComprar.setBounds(50, 200, 150, 30);
        add(buttonComprar);
        labelVuelto.setBounds(50, 250, 250, 30);
        add(labelVuelto);
        cantidadMonedas = new JTextField();
        cantidadMonedas.setBounds(50, 340, 150, 30);
        add(cantidadMonedas);
        titleLabel.setBounds(50, 150, 150, 30);

/**
 * ActionListener para establecer el valor de las monedas
 */
        InsertarMoneda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valorMoneda = Integer.parseInt(cantidadMonedas.getText());
                moneda = obtenerMonedaConValor(valorMoneda);
            }
        });
        buttonComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (moneda != null && eleccionProducto != -1 && expendedor != null) {
                    try {
                        /**
                         * Intenta crear un comprador con los datos recopilados
                         */
                        comprador = new tarea3.Comprador(moneda, eleccionProducto, expendedor);
                        /**
                         * Actualizar la interfaz con la información de la compra
                         */

                        labelVuelto.setText("Producto comprado: " + comprador.queBebiste() + ", Vuelto: " + comprador.cuantoVuelto());
                    } catch (tarea3.NoHayProductoException | tarea3.PagoInsuficienteException | tarea3.PagoIncorrectoException ex) {
                        /** Manejar las excepciones específicas aquí
                         * Por ejemplo, mostrar un mensaje de error en la interfaz
                         *
                         */

                        labelVuelto.setText("Error: " + ex.getMessage());
                    }
                } else {
                    /**
                     * Manejar si los datos no están completos o válidos
                     */
                    labelVuelto.setText("Por favor, complete todos los datos antes de comprar.");
                }
            }
        });
        /**
         * ActionListener para los botones de selección de producto
         */

        for (int i = 0; i < 6; i++) {
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    /**
                     *           Obtener el texto del botón presionado
                     */
                    String buttonText = ((JButton) e.getSource()).getText();
                    eleccionProducto = Integer.parseInt(buttonText);
                }
            });

        }

    }
    /**
     * Método para obtener el tipo de moneda según el valor ingresado.
     *
     * @param valor El valor numérico de la moneda a obtener.
     * @return La instancia de la moneda correspondiente al valor ingresado, o null si no se reconoce.
     */
    private tarea3.Moneda obtenerMonedaConValor(int valor) {
        tarea3.Moneda moneda;

        switch (valor) {
            case 100:
                moneda = new tarea3.Moneda100();
                break;
            case 500:
                moneda = new tarea3.Moneda500();
                break;
            case 1000:
                moneda = new tarea3.Moneda1000();
                break;
            case 1500:
                moneda = new tarea3.Moneda1500();
                break;
            default:
                moneda = null;
                break;
        }

        return moneda;
    }

    /**
     * Método que dibuja los elementos gráficos del expendedor.
     *
     * @param g Objeto Graphics donde se realizará el dibujo.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        g.drawRect(40, 40, 470, 490);
        for (JButton button : buttons) {
            button.setBackground(Color.PINK);
        }

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(50, 420, 150, 100);
        g.setColor(Color.BLACK);
        g.drawRect(50, 420, 150, 100);

        g.setColor(Color.gray);
        g.fillRect(300, 50, 200, 470);
        g.setColor(Color.BLACK);
        g.drawRect(300, 50, 200, 470);
        icoca.paint(g);
        ifanta.paint(g);
        isprite.paint(g);
        isuper8.paint(g);
        isniker.paint(g);

    }

}