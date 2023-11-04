package tarea3;

import java.awt.*;

/**
 * La clase Moneda1000 representa un valor de una momeda de 1000.
 */
public class Moneda1000 extends Moneda {

    public Moneda1000(Color color) {
        super(color);
    }
    /**
     * Obtiene el valor de la Moneda1000, en este caso, 100 unidades monetarias
     * @return El valor de la Moneda1000, que es 100 UM
     */
    public int getValor() {
        return 1000;
    }

}