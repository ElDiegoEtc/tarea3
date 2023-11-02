package tarea3;

public class Snicker extends Dulce {
    /**
     *
     * @param serie           El número de serie del Snicker.
     * @param precioProducto  El precio del Snicker representado por un objeto PrecioProducto de tipo SNICKER.
     */
    public Snicker(int serie, PrecioProducto precioProducto) {
        super(serie, precioProducto.SNICKER);
    }
    /**
     *metodo para simular la accion ingerir
     * @return Devuelve un String que indica que se está consumiendo un Snicker.
     */
    public String ingerir(){
        return "SNICKERS";
    }

}
