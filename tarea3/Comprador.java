package tarea3;

/**
 * @Class: La clase Comprador sirva para decirle a la clase expendedor como debe efectuar la compra, y usar las respuestas de esta clase para almacenar
 * el sonido de lo que se compro y el vuelto
 */
public class Comprador{
    private String sonido;
    private int vuelto;

    /**
     * Compra un producto dado en un expendedor ya creado, con una moneda y un valor de eleccion del producto. Si hay vuelto, se almacena
     * el sonido de lo consumido.
     *
     * @param m: moneda dada para pagar el producto
     * @param eleccion: numero de seleccion del producto
     * @param exp: expendedor ya creado
     * @throws PagoIncorrectoException: Si no se uso una moneda para comprar el producto, se devuelve un mensaje
     * @throws PagoInsuficienteException: Si el valor de la moneda con la que se pago es menor al valor del producto, se devuelve un mensaje y la moneda
     * @throws NoHayProductoException: Si no existe mas del producto seleccionado, se devuelve un mensaje y la moneda
     */

    public Comprador(Moneda m, int eleccion, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        exp.comprarProducto(m, eleccion);
        Producto p = exp.getProducto();

        Moneda moneda = null;
        while ((moneda = exp.getVuelto()) != null) {
            this.vuelto += moneda.getValor();
        }
        if (p != null) {
            this.sonido = p.ingerir();
        }
    }

    /**
     * Metodo para saber cuanto es el vuelto despues de efectuada la compra
     * @return vuelto de la compra
     */
    public int cuantoVuelto() {

        return vuelto;
    }

    /**
     * Metodo que se usa para saber que se consumio
     * @return el sonido de lo que se consumio, puede ser de una bebida o de un dulce
     */
    public String queBebiste() {
        return sonido;
    }
}
