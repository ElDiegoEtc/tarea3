package tarea3;

public class Super8 extends Dulce {
    /**
     *
     * @param serie           El número de serie del Super8.
     * @param precioProducto  El precio del Super8 representado por un objeto PrecioProducto de tipo SUPER8.
     */
    public Super8(int serie, PrecioProducto precioProducto) {
        super(serie, precioProducto.SUPER8);
    }
    /**
     *
     * @return Devuelve un String que indica que se está ingiriendo un Super8.
     */
    public String ingerir(){
        return "SUPER8";
    }

}