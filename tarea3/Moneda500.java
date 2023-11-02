package tarea3;

import java.awt.*;

/**
 * La clase Moneda500 representa un valor de una momeda de 500.
 */
class Moneda500 extends Moneda {

    public Moneda500() {
        super();
    }
    /**
     * Obtiene el valor de la Moneda100, en este caso, 500 unidades monetarias
     * @return El valor de la Moneda100, que es 500 UM
     */
    public int getValor() {
        return 500;
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(50,50,50,50);
    }

}