package com.example.muppy.productos;

import model.Veterinaria;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class EscribirInfo implements Archivo{
    public boolean ejecutar(String correo,String contra,String nomarch) {

        List<String>  infoV=new ArrayList<>();
        infoV.add(correo);
        infoV.add(contra);

        try{
            // Se crea el flujo de salida al archivo de nombre nomarch
            OutputStreamWriter out= new OutputStreamWriter(new FileOutputStream(nomarch));
            //Escribe una cadena en el flujo

            for (int i=0; i<infoV.size(); i+=2){
                String cad=infoV.get(i);
                String cad2=infoV.get(i+1);
                out.write(cad +"/"+cad2+ "\n");
            }
            out.close();
        }
        catch(Exception e){
            System.out.println("Ocurrio un error escribiendo a un archivo el reporte: " + e);
        }
        return true;
    }
}
