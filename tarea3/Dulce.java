package tarea3;


public abstract class Dulce extends Producto {
    /**
     *
     * @param serie           El número de serie del dulce.
     * @param precioProducto  El precio del dulce que se representa por un objeto PrecioProducto.
     */
    public Dulce(int serie,PrecioProducto precioProducto) {
        super(serie,precioProducto);
    }
}
