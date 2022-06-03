package model;

public class ProductoPerros extends Producto {
    public ProductoPerros(String nombre, int precio, int cantidad,boolean descuento) {
        super();
        this.precioTotal = precioTipoProducto(cantidad, precio,descuento);
        this.nombre = nombre;
    }

    @Override
    double precioTipoProducto(int cantidad, int precio,boolean descuento) {
        return (cantidad * (precio - (precio * 0.1)));
    }
}