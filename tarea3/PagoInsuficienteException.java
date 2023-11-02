package tarea3;

public class PagoInsuficienteException extends Exception{
    /**
     *
     * @param mensaje mensaje cuando el pago es insuficiente
     */
    public PagoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
