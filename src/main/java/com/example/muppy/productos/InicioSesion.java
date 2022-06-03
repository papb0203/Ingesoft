package com.example.muppy.productos;

public class InicioSesion implements Perfil{
    public void doAction(com.example.muppy.Perfil perfil) {
        //System.out.println("Player is in start state");
        perfil.inicioSecion(this);
    }

    public String toString(){
        return "Si";
    }
}
