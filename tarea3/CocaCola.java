package tarea3;
import java.awt.*;
import javax.swing.JPanel;

/**
 * clase CocaCola que es subclase de Bebida para representar el tipo especifico de bebida
 */
class CocaCola extends Bebida {
    /**
     *
     * @param serie El número de serie de la CocaCola.
     * @param precioProducto El precio de la CocaCola, se representa por un objeto PrecioProducto de tipo COCA.
     *
     */
    public CocaCola(int serie, PrecioProducto precioProducto) {
        super(serie, precioProducto.COCA);
    }

    /**
     * Metodo para simular la accion de ingerir
     * @return devuelve string para señalar que es bebiendo
     */
    public String ingerir(){
        return "CocaCola";
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(40,40,50,30);
    }

}
