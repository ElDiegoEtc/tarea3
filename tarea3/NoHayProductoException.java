package tarea3;
/**
 * La clase NoHayProductoException es una excepción  cuando no hay un producto disponibles
 */
public class NoHayProductoException extends Exception {
    /**
     *
     * @param mensage El mensaje que describe la excepción cuando no hay productos
     */
    public NoHayProductoException(String mensage){
        super(mensage);
    }
}
