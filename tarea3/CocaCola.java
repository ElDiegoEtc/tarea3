package tarea3;

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

}
