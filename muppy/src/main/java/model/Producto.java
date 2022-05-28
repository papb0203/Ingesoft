package model;

public abstract class Producto {
    abstract int precioTipoProducto(int cantidad);
}

class ProductoGatos extends Producto{
    @Override
    int precioTipoProducto(int cantidad) {
        return cantidad*17600;
    }
}

class ProductoPerros extends Producto{
    @Override
    int precioTipoProducto(int cantidad) {
        return cantidad*22000;
    }
}