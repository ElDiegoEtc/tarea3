package tarea3;
import java.awt.*;
import javax.swing.JPanel;
/**
 * La clase Moneda100 representa un valor de una momeda de 100.
 */
public class Moneda100 extends Moneda {

    public Moneda100(Color color) {
        super(color);
    }

    /**
     * Obtiene el valor de la Moneda100, en este caso, 100 unidades monetarias
     * @return El valor de la Moneda100, que es 100 UM
     */
    public int getValor() {
        return 100;
    }



}