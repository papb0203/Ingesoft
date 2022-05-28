package model;

public class Veterinaria {
    private String nombre, direccion,correo,contrasena,telefono;
    private static Veterinaria veterinaria;


    public Veterinaria(String nombre, String direccion, String correo, String contrasena, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
        System.out.println("Veterinaria: " + this.nombre);
    }

    public Veterinaria() {

    }

    public static Veterinaria getSingletonInstance(String nombre,String direccion,String correo,String contrasena,String telefono) {
        if (veterinaria == null){
            veterinaria = new Veterinaria(nombre,direccion,correo,contrasena,telefono);
        }
        /*else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }*/
        return veterinaria;
    }
}
