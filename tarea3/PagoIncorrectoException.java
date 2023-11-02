package tarea3;
/**
 * La clase PagoIncorrectoException es una excepción  cuando el pago fue incorrecto y no se proceso
 */
public class PagoIncorrectoException extends Exception{
    /**
     *
     * @param mensaje El mensaje que describe la excepción el pago fue incorrecto
     */
    public PagoIncorrectoException(String mensaje){
        super(mensaje);
    }
}
