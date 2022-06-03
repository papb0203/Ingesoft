package model;

import java.util.UUID;

public class Usuario {
    String nombre;
    String contraseina;
    String correo;
    String direccion;
    String telefono;
    UUID codigoUsuario;

    public Usuario(String nombre,String correo,String contraseina,String telefono,String direccion){
        this.nombre = nombre;
        this.contraseina = contraseina;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        codigoUsuario=UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contraseina='" + contraseina + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseina() {
        return contraseina;
    }

    public void setContraseina(String contraseina) {
        this.contraseina = contraseina;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public UUID getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(UUID codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}