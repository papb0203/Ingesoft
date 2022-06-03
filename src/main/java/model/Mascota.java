package model;

import java.util.UUID;

public class Mascota {

    String nombre,tamanio,raza;
    String edad;
    String peso;
    String tipo;
    UUID codigoMascota;

    public Mascota(String nombre, String tamanio, String raza, String edad, String peso,String tipo) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.tipo = tipo;
        codigoMascota=UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", raza='" + raza + '\'' +
                ", edad='" + edad + '\'' +
                ", peso='" + peso + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamaño) {
        this.tamanio = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
