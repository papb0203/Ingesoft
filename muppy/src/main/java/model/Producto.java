package model;

public abstract class Producto {
    public String nombre;
    public double precioTotal;
    abstract double precioTipoProducto(int cantidad, int precio, boolean descuento);
}
