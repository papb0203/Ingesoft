package com.example.muppy.productos;

import java.util.ArrayList;
import java.util.List;

public class ManejadorArchivo {
    public ManejadorArchivo() {
    }

    public ArrayList<String> ejecutar(Archivo archivo, String correo, String contra, String nomarchivo) {
        ArrayList<String>esta=new ArrayList<>();
        archivo.ejecutar(correo, contra, nomarchivo);
        return esta;
    }

    public void ejecutar2(Archivo archivo,String nombre, String correo, String direccion, String telefono, String contra,String nom){
        archivo.ejecutar2(nombre,correo,direccion,telefono,contra,nom);
    }

}
