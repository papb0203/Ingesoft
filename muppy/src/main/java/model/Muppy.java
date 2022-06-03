package model;

import model.Mascota;
import model.Usuario;
import model.Veterinaria;

import java.util.ArrayList;

public class Muppy {


    ArrayList<Usuario> listUsuarios= new ArrayList<Usuario>();
    ArrayList<Veterinaria>listVeterinarias= new ArrayList<Veterinaria>();
    ArrayList<Mascota>listMascota=new ArrayList<Mascota>();

    public void agregarUsuario(String nombre, String contraseina, String correo,String telefono,String direccion){
        Usuario usuario;
        usuario = new Usuario(nombre, correo,contraseina, telefono, direccion);
        listUsuarios.add(usuario);
    }

    public void agregarMascota(String nombre,String tamanio, String raza, String edad, String peso,String tipo){
        Mascota mascota;
        mascota= new Mascota(nombre,tamanio,raza,edad,peso,tipo);
        listMascota.add(mascota);
    }
    public String toString() {
        return "Muppy{" +
                "listUsuarios=" + listUsuarios +
                ", listVeterinarias=" + listVeterinarias +
                ", listMascota=" + listMascota +
                '}';
    }

    public ArrayList<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public ArrayList<Mascota> getListMascota() {
        return listMascota;
    }

    public void setListMascota(ArrayList<Mascota> listMascota) {
        this.listMascota = listMascota;
    }
}
