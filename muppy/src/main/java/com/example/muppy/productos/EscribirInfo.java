package com.example.muppy.productos;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class EscribirInfo implements Archivo {
    List<String> infoV = new ArrayList();
    public EscribirInfo() {
    }

    public boolean ejecutar(String correo, String contra, String nomarch) {
        //List<String> infoV = new ArrayList();
        infoV.add(correo);
        infoV.add(contra);

        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(nomarch));

            for(int i = 0; i < infoV.size(); i += 2) {
                String cad = (String)infoV.get(i);
                String cad2 = (String)infoV.get(i + 1);
                out.write(cad + "/" + cad2 + "\n");
            }

            out.close();
        } catch (Exception var9) {
            System.out.println("Ocurrio un error escribiendo a un archivo el reporte: " + var9);
        }

        return true;
    }

    public void ejecutar2(String nombre,String correo,String direccion,String telefono,String contra,String nom){
        /*infoV.add(nombre);
        infoV.add(correo);
        infoV.add(direccion);
        infoV.add(telefono);
        infoV.add(contra);*/
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(nom));

            out.write(nombre + "/" + correo + "/" + direccion+ "/" + telefono+ "/" + contra+"\n");
            /*
            for(int i = 0; i < infoV.size(); i += 5) {
                String cad = (String)infoV.get(i);
                String cad2 = (String)infoV.get(i + 1);
                String cad3 = (String)infoV.get(i+2);
                String cad4 = (String)infoV.get(i + 3);
                String cad5 = (String)infoV.get(i+4);
                out.write(cad + "/" + cad2 + "/" + cad3+ "/" + cad4+ "/" + cad5+"\n");
            }
            */
            out.close();
        } catch (Exception var9) {
            System.out.println("Ocurrio un error escribiendo a un archivo el reporte: " + var9);
        }
    }

}

