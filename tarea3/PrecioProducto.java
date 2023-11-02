package tarea3;
/**
 * Enumeración que representa los precios de diferentes productos.
 */
enum PrecioProducto {
    COCA(1000),
    SPRITE(1000),
    FANTA(1000),
    SNICKER(1500),
    SUPER8(1200);

    private final int precio;
    /**
     *
     * @param precio El precio del producto .
     */
    PrecioProducto(int precio) {
        this.precio = precio;
    }
    /**
     * Método para obtener el precio del producto.
     *
     * @return El precio del producto.
     */
    public int getPrecio() {
        return precio;}
}