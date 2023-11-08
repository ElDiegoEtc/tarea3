package tarea3;

public abstract class Producto {
    private int serie;
    private PrecioProducto precioProducto;
    /**
     *
     * @param serie           El número de serie del producto.
     * @param precioProducto  El precio del producto representado por un objeto PrecioProducto.
     */
    public Producto(int serie, PrecioProducto precioProducto) {
        this.serie = serie;
        this.precioProducto = precioProducto;
    }
    /**
     *
     * @return Devuelve un String que indica la acción de ingerir el producto.
     */
    public abstract String ingerir();
    /**
     *
     * @return El número de serie del producto.
     */
    public int getSerie() {
        return serie;
    }
    /**
     *
     * @return El precio del producto representado por un objeto PrecioProducto.
     */

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }
}