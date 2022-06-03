package com.example.muppy.productos;

import model.Veterinaria;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ValidarInfo implements Archivo{


    public boolean ejecutar(String correo,String contra,String nomarchivo) {


        boolean valido=false;
        try{
            InputStreamReader input=new InputStreamReader(new FileInputStream(nomarchivo));

            BufferedReader fa=new BufferedReader(input);

            String cad=fa.readLine();

            while (!cad.equalsIgnoreCase("FIN")) {

                String[] tokens = cad.split("/");

                if (tokens[0].equalsIgnoreCase(correo)) {
                    if ((tokens[1].equalsIgnoreCase(contra))) {
                        valido=true;
                    }
                }

            }
        }catch (Exception e){
            System.out.println("Ocurrio un problema al cargar el archivo de texto " + e);
        }
        return valido;
    }
}

