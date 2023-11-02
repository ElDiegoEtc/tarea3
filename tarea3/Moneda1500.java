package tarea3;

import java.awt.*;

/**
 * La clase Moneda1500 representa un valor de una momeda de 1500.
 */
class Moneda1500 extends Moneda {

    public Moneda1500() {
        super();
    }
    /**
     * Obtiene el valor de la Moneda1500, en este caso, 100 unidades monetarias
     * @return El valor de la Moneda1500, que es 100 UM
     */
    public int getValor() {
        return 1500;
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawOval(20,50,50,50);
    }
}