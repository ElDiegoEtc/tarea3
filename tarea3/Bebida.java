package tarea3;

/**
 *  * La clase abstracta Bebida que extiende de la clase Producto, representa un tipo de producto que es una bebida
 */
 abstract class Bebida extends Producto {
     /**
      *
      * @param serie el numero de serie de la bebida
      * @param precioProducto el precio de la bebida representado por un objeto precioProducto
      */
    public Bebida(int serie,PrecioProducto precioProducto) {
        super(serie,precioProducto);
    }

 }
