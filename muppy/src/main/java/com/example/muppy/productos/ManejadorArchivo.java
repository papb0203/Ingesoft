package com.example.muppy.productos;

public class ManejadorArchivo {


    public boolean ejecutar(Archivo archivo, String correo, String contra, String nomarchivo){
        boolean valido=false;
        valido=archivo.ejecutar(correo,contra,nomarchivo);
        return valido;
    }
}
