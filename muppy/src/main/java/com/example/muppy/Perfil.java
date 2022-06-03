package com.example.muppy;

import com.example.muppy.productos.InicioSesion;
import com.example.muppy.productos.Registro;
import com.example.muppy.productos.ValidarInfo;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Usuario;

public class Perfil {

    private com.example.muppy.productos.Perfil perf;
    String nombre,correo,contra,direccion,telefono;
    @FXML
    private TextField buscar;

    @FXML
    private ImageView carritoCompras;

    @FXML
    private TextField correoN;

    @FXML
    private TextField direccionN;

    @FXML
    private Button guardarC;

    @FXML
    private ImageView menu;

    @FXML
    private TextField nComtrasenia;

    @FXML
    private TextField nombreN;

    @FXML
    private ImageView perfil;

    @FXML
    private ImageView perfil1;

    @FXML
    private Text productosGato;

    @FXML
    private Text productosGenerales;

    @FXML
    private Text productosPerro;

    @FXML
    private TextField telefonoN;

    @FXML
    private Text veterinarias;

    @FXML
    void MostrarVeterinarias(MouseEvent event) {

    }

    @FXML
    void mostrarCarrito(MouseEvent event) {

    }

    @FXML
    void mostrarPerfil(MouseEvent event) {

    }

    @FXML
    void mostrarProductosG(MouseEvent event) {

    }

    @FXML
    void mostrarProductosGen(MouseEvent event) {

    }

    @FXML
    void mostrarProductosP(MouseEvent event) {

    }

    @FXML
    public void realizarCambios(ActionEvent event) {
        Usuario nomina= ValidarInfo.info("info");
       // System.out.println(nombre);
        nombreN.setText(String.valueOf(nomina.getNombre()));
        correoN.setText(String.valueOf(nomina.getCorreo()));
        direccionN.setText(String.valueOf(nomina.getDireccion()));
        nComtrasenia.setText(String.valueOf(nomina.getContraseina()));
        telefonoN.setText(String.valueOf(nomina.getTelefono()));

    }
    public Perfil(){
        //perfil = null;
    }

    public void datos(String nombre,String direccion,String contrasenia,String telefono,String correo){
        Usuario nomina= ValidarInfo.info("info");
        this.nombre=nombre;
        this.direccion=direccion;
        this.contra=contrasenia;
        this.telefono=telefono;
        this.correo=correo;
    }
    public void registro(Registro registro) {
        this.perf=registro;

    }

    public void inicioSecion(InicioSesion inicioSesion) {
        this.perf=inicioSesion;
    }

    public com.example.muppy.productos.Perfil getPerfil(){
        return perf;
    }
    @FXML
    void volverMenu(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrincipal.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.menu.getScene().getWindow();
        myStage.close();
    }


}
