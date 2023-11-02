package tarea3;
import java.awt.*;
import javax.swing.JPanel;
/**
 * La clase Moneda100 representa un valor de una momeda de 100.
 */
class Moneda100 extends Moneda {

    public Moneda100() {
        super();
    }
    /**
     * Obtiene el valor de la Moneda100, en este caso, 100 unidades monetarias
     * @return El valor de la Moneda100, que es 100 UM
     */
    public int getValor() {
        return 100;
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawOval(40,50,50,50);
    }

}