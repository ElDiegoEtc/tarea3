package tarea3;

import java.util.ArrayList;

/**
 * @class: Se ocupa para crear depositos donde almacenar productos o monedas (en un arraylist), lo llamamos item
 * @param <T>: Puede ser de tipo Producto o Moneda, dependiendo del deposito que se quiera
 */
public class DepositoGenerico<T> {

    private ArrayList<T> items;

    public DepositoGenerico() {
        items = new ArrayList<>();
    }

    /**
     *  Se usa para añadir un item  al arraylist
     * @param item: Puede ser un tipo de moneda o un tipo de producto
     */
    public void addItem(T item) {
        items.add(item);
    }
    public ArrayList<T> getArray() {
        return items;
    }

    /**
     * Es un getter para el item del arraylist
     * @return retorna el item si el arraylist tiene, si no, retorna null
     */
    public T getItem() {
        if (items.size() == 0) {
            return null;
        } else {
            return items.remove(0);
        }
    }
}