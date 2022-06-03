package model;

public class ProductoGatos extends Producto {
    public ProductoGatos(String nombre, int precio, int cantidad,boolean descuento) {
        super();
        this.precioTotal = precioTipoProducto(cantidad, precio,descuento);
        this.nombre = nombre;
    }

    @Override
    double precioTipoProducto(int cantidad, int precio,boolean descuento) {
        if(!descuento){
            return (cantidad * (precio));
        }
        return (cantidad * (precio + (precio * 0.3)));
    }
}
