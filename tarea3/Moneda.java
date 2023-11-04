package tarea3;

import java.awt.*;

/**
 * La clase abstracta Moneda representa una moneda genérica.
 */
public abstract class Moneda implements Comparable<Moneda>{

    protected Color color;

    public Moneda(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    /**
     *metodo para obtener la serie de la moneda
     * @return La serie de la moneda.
     */
    public Moneda getSerie() {
        return this;
    }
    /**
     * Método abstracto para obtener el valor de la moneda.
     * @return El valor de la moneda.
     */

    public abstract int getValor();

    /**
     * Método para comparar el valor de la moneda con otra
     * @param anycoin the object to be compared con otra moneda para comparar)
     * @return  Un entero que indica la comparación de valores entre las monedas
     */
    public int compareTo(Moneda anycoin){
        int comparacion = Integer.compare(this.getValor(), anycoin.getValor());
        return comparacion;
    }

}