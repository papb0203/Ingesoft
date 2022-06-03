package com.example.muppy;

import com.example.muppy.productos.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Veterinaria;

public class PantallaRegistrarVeterinaria implements Initializable {

    Perfil perfil= new Perfil();
    @FXML
    private ComboBox amPmFin;
    @FXML
    private ComboBox amPmIni;
    @FXML
    private Text botonAtras;
    @FXML
    private Text botonEntrar;
    @FXML
    private TextField contraseniaV;
    @FXML
    private TextField correoV;
    @FXML
    private TextField direccionV;
    @FXML
    private ComboBox horaFin;
    @FXML
    private ComboBox horaIni;
    @FXML
    private TextField nombreV;
    @FXML
    private TextField telefonoV;

    public PantallaRegistrarVeterinaria() {
    }

    @FXML
    void pantallaInicio(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("hello-view.fxml"));
            Parent root1 = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        Stage myStage = (Stage)this.botonAtras.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void pantallaRegistro(MouseEvent event) {
        String perf="si";
        String nombre = this.nombreV.getText();
        String direccion = this.direccionV.getText();
        String correo = this.correoV.getText();
        String contra = this.contraseniaV.getText();
        String tel = this.telefonoV.getText();
        Veterinaria.getSingletonInstance(nombre, direccion, correo, contra, tel);
        SuperArchivo st = new SuperArchivo();
        st.addTarea(new EscribirInfo());
        new ManejadorArchivo();
        boolean listo = st.ejecutar(correo, contra, "vet");
        st.ejecutar2(nombre,correo,direccion,tel,contra,"info");
        System.out.println(listo);

        //Perfil perfil=new Perfil();
        Registro registro= new Registro();
        registro.doAction(perfil);
        //System.out.println(perfil.getPerfil().toString());
        perfil.datos(nombre,direccion,contra,tel,correo);

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("menuPrincipal.fxml"));
            Parent root1 = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception var14) {
            var14.printStackTrace();
        }

        Stage myStage = (Stage)this.botonEntrar.getScene().getWindow();
        myStage.close();
    }

    public void initialize(URL location, ResourceBundle resources) {
        this.horaFin.getItems().add("5");
        this.horaFin.getItems().add("6");
        this.horaFin.getItems().add("7");
        this.horaFin.getItems().add("8");
        this.horaFin.getItems().add("9");
        this.horaIni.getItems().add("6");
        this.horaIni.getItems().add("7");
        this.horaIni.getItems().add("8");
        this.horaIni.getItems().add("9");
        this.horaIni.getItems().add("10");
        this.amPmFin.getItems().add("am");
        this.amPmFin.getItems().add("pm");
        this.amPmIni.getItems().add("am");
        this.amPmIni.getItems().add("pm");
    }
}
