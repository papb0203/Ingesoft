package com.example.muppy.productos;

import model.Usuario;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ValidarInfo implements Archivo {
    public ValidarInfo() {
    }

    public boolean ejecutar(String correo, String contra, String nomarchivo) {
        boolean valido = false;

        try {
            InputStreamReader input = new InputStreamReader(new FileInputStream(nomarchivo));
            BufferedReader fa = new BufferedReader(input);
            String cad = fa.readLine();

            while(!cad.equalsIgnoreCase("FIN")) {
                String[] tokens = cad.split("/");
                if (tokens[0].equalsIgnoreCase(correo) && tokens[1].equalsIgnoreCase(contra)) {
                    valido = true;
                }
            }
        } catch (Exception var9) {
            System.out.println("Ocurrio un problema al cargar el archivo de texto " + var9);
        }

        return valido;
    }
    public void ejecutar2(String nombre,String correo,String direccion,String telefono,String contra,String nom){

    }

    public static Usuario info(String nom){
        Usuario us=new Usuario();

        try {
            InputStreamReader input = new InputStreamReader(new FileInputStream(nom));
            BufferedReader fa = new BufferedReader(input);
            String cad = fa.readLine();
            String[] tokens = cad.split("/");
            us.setNombre(tokens[0]);
            us.setCorreo(tokens[1]);
            us.setDireccion(tokens[2]);
            us.setTelefono(tokens[3]);
            us.setContraseina(tokens[4]);

        } catch (Exception var9) {
            System.out.println("Ocurrio un problema al cargar el archivo de texto " + var9);
        }

        return us;
    }
}
