package tarea3;
/**
 * clase Sprite que es subclase de Bebida para representar el tipo especifico de bebida
 */
class Sprite extends Bebida {
    /**
     *
     * @param serie El número de serie de la Sprite.
     * @param precioProducto El precio de la Sprite, se representa por un objeto PrecioProducto de tipo SPRITE.
     *
     */
    public Sprite(int serie, PrecioProducto precioProducto) {
        super(serie, precioProducto.SPRITE);
    }
    /**
     * Metodo para simular la accion de ingerir
     * @return devuelve string para señalar que es bebiendo
     */
    public String ingerir(){
        return "Sprite";
    }

}
