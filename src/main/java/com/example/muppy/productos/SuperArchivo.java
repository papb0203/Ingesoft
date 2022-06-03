package com.example.muppy.productos;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SuperArchivo implements Archivo  {

    boolean valido;
    private List<Archivo> lista = new ArrayList();

    public SuperArchivo() {
    }

    public void addTarea(Archivo arch) {
        this.lista.add(arch);
    }

    public boolean ejecutar(String correo, String contra, String nomarchivo) {
        this.lista.forEach((t) -> {
            t.ejecutar(correo, contra, nomarchivo);
        });
        return true;
    }
    public void ejecutar2(String nombre,String correo,String direccion,String telefono,String contra,String nom){
        this.lista.forEach((t) -> {
            t.ejecutar2(nombre,correo,direccion,telefono,contra,nom);
        });

    }

}
