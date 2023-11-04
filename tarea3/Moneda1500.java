package tarea3;

import java.awt.*;
import tarea3.*;

/**
 * La clase Moneda1500 representa un valor de una momeda de 1500.
 */
public class Moneda1500 extends Moneda {

    public Moneda1500(Color color) {
        super(color);
    }

    /**
     * Obtiene el valor de la Moneda1500, en este caso, 100 unidades monetarias
     * @return El valor de la Moneda1500, que es 100 UM
     */
    public int getValor() {
        return 1500;
    }

}