package tarea3;

import java.awt.*;

/**
 * @class: Es la clase que dirije las operaciones del expendedor como las comprar, arroja las exepciones, recarga el expendedor, etc
 */
public class Expendedor {
    private int precioProductos;
    private DepositoGenerico<Producto> coca;
    private DepositoGenerico<Producto> sprite;
    private DepositoGenerico<Producto> fanta;
    private DepositoGenerico<Producto> snicker;
    private DepositoGenerico<Producto> super8;
    private DepositoGenerico<Moneda> monedasVuelto;

    //Tarea3
    private DepositoGenerico<Moneda> depositoEspecialMonedas;
    private DepositoGenerico<Producto> depositoEspecial;


    /**
     * Metodo constructor del expendedor que llena el expendedor de productos
     * @param cantidadProductos: La cantitad de productos con la que inicialmente se llena el expendedor
     */
    public Expendedor(int cantidadProductos) {
        precioProductos = PrecioProducto.COCA.getPrecio(); // Precio base
        coca = new DepositoGenerico<>();
        fanta = new DepositoGenerico<>();
        sprite = new DepositoGenerico<>();
        snicker = new DepositoGenerico<>();
        super8 = new DepositoGenerico<>();
        monedasVuelto = new DepositoGenerico<>();
        //Tarea3
        depositoEspecialMonedas = new DepositoGenerico<>();

        for (BucleProducto producto : BucleProducto.values()) {
            for (int i = 0; i < cantidadProductos; i++) {
                if (producto == BucleProducto.c) {
                    coca.addItem(new CocaCola(producto.getN(), PrecioProducto.COCA));
                } else if (producto == BucleProducto.s) {
                    sprite.addItem(new Sprite(producto.getN(), PrecioProducto.SPRITE));
                } else if (producto == BucleProducto.f) {
                    fanta.addItem(new Fanta(producto.getN(), PrecioProducto.FANTA));
                } else if (producto == BucleProducto.sn) {
                    snicker.addItem(new Snicker(producto.getN(), PrecioProducto.SNICKER));
                } else if (producto == BucleProducto.S8) {
                    super8.addItem(new Super8(producto.getN(), PrecioProducto.SUPER8));
                }
            }
        }
    }

    /** Sirve para que dada una moneda y el numero de un producto, se haga la compra de este y se
     * almacene en un deposito especial.
     *
     * @param m: La moneda con la que el comprador paga para tener un producto
     * @param eleccion: El numero asociado al producto que se desea en el expendedor
     * @throws PagoIncorrectoException: Si no se uso una moneda para comprar el producto, se devuelve un mensaje
     * @throws PagoInsuficienteException: Si el valor de la moneda con la que se pago es menor al valor del producto, se devuelve un mensaje y la moneda
     * @throws NoHayProductoException: Si no existe mas del producto seleccionado, se devuelve un mensaje y la moneda
     */
    public void comprarProducto(Moneda m, int eleccion) throws NoHayProductoException,
            PagoInsuficienteException, PagoIncorrectoException {
        Producto p = null;
        //Tarea3
        depositoEspecial = new DepositoGenerico<>();

        if (m == null) throw new PagoIncorrectoException ("Pago no relizado");
        if (m.getValor() < precioProductos) throw new PagoInsuficienteException("Pago Insuficiente, " + m.getValor());
        if (m != null && m.getValor() >= precioProductos) {
            if (eleccion == Valoresserie.COCA.getNum()) {
                p = coca.getItem();
                precioProductos = PrecioProducto.COCA.getPrecio();
            } else if (eleccion == Valoresserie.SPRITE.getNum()) {
                p = sprite.getItem();
                precioProductos = PrecioProducto.SPRITE.getPrecio();
            } else if (eleccion == Valoresserie.FANTA.getNum()) {
                p = fanta.getItem();
                precioProductos = PrecioProducto.FANTA.getPrecio();
            } else if (eleccion == Valoresserie.SNICKER.getNum()) {
                p = snicker.getItem();
                precioProductos = PrecioProducto.SNICKER.getPrecio();
            } else if (eleccion == Valoresserie.SUPER8.getNum()) {
                p = super8.getItem();
                precioProductos = PrecioProducto.SUPER8.getPrecio();
            }
            if (p == null) throw new NoHayProductoException("No hay producto de lo solicitado, " + m.getValor());
            if (p != null) {
                int n = (m.getValor() - precioProductos) / 100;
                while (n > 0) {
                    monedasVuelto.addItem(new Moneda100());
                    n--;
                }
                //Tarea3
                depositoEspecialMonedas.addItem(m);
            }
        }
        if (p == null || m.getValor() < precioProductos) monedasVuelto.addItem(m);
        depositoEspecial.addItem(p);
    }

    /**
     * @return: devuelve el vuelto
     */
    public Moneda getVuelto() {
        return monedasVuelto.getItem();
    }

    /**
     * @return: devuelve el item que se compro en esta instancia
     */
    public Producto getProducto(){
        return depositoEspecial.getItem();
    }

    /**
     * Getter para el depósito de CocaCola
     * @return: el depósito de CocaCola
     */
    public DepositoGenerico<Producto> getCocaDeposito() {
        return coca;
    }

    /**
     * Getter para el depósito de Sprite
     * @return: el depósito de Sprite
     */
    public DepositoGenerico<Producto> getaSpriteDeposito() {
        return sprite;
    }

    /**
     * Getter para el depósito de Fanta
     * @return: el depósito de Fanta
     */
    public DepositoGenerico<Producto> getFantaDeposito() {
        return fanta;
    }

    /**
     * Getter para el depósito de Snicker
     * @return: el depósito de Snicker
     */
    public DepositoGenerico<Producto> getSnickerDeposito() {
        return snicker;
    }

    /**
     * Getter para el depósito de Super8
     * @return: el depósito de Super8
     */
    public DepositoGenerico<Producto> getSuper8Deposito() {
        return super8;
    }

}