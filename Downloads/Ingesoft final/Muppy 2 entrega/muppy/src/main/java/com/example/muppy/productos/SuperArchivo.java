package com.example.muppy.productos;
import java.util.ArrayList;
import java.util.List;

public class SuperArchivo implements Archivo{

    boolean valido;

    private List<Archivo> lista= new ArrayList<Archivo>();

    public void addTarea(Archivo arch) {
        lista.add(arch);
    }
    @Override
    public boolean ejecutar(String correo,String contra,String nomarchivo){

       lista.forEach((t)->t.ejecutar(correo, contra, nomarchivo));;

        return true;
    }


}
