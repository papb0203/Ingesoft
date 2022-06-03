package com.example.muppy.productos;

public class Registro implements Perfil{
    public void doAction(com.example.muppy.Perfil perfil) {
       // System.out.println("Player is in start state");
        perfil.registro(this);
    }
    public String toString(){
        return "si";
    }
}
