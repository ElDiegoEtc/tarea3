package tarea3;

import java.awt.*;

/**
 * clase Fanta que es subclase de Bebida para representar el tipo especifico de bebida
 */
class Fanta extends Bebida {
    /**
     *
     * @param serie El número de serie de la Fanta.
     * @param precioProducto El precio de la Fanta, se representa por un objeto PrecioProducto de tipo FANTA.
     *
     */
    public Fanta(int serie, PrecioProducto precioProducto) {
        super(serie, precioProducto.FANTA);
    }
    /**
     * Metodo para simular la accion de ingerir
     * @return devuelve string para señalar que es bebiendo
     */


    public void paint(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(10,30,50,50);
    }
    public String ingerir(){
        return "Fanta";
    }

}