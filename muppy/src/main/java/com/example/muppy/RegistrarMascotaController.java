package com.example.muppy;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistrarMascotaController implements Initializable {

    @FXML
    private Text botonAtras;

    @FXML
    private Text botonFinalizar;

    @FXML
    private TextField edadMascota;

    @FXML
    private TextField nombreMascota;

    @FXML
    private TextField pesoMascota;

    @FXML
    private ComboBox razaMascota;

    @FXML
    private ComboBox tamanioMascota;

    @FXML
    private ToggleButton tipoGato;

    @FXML
    private ToggleGroup tipoMascota;

    @FXML
    private ToggleButton tipoPerro;

    @FXML
    void pantallaRegistro(MouseEvent event) {

        String edad, nombre, peso, raza, tamanio,tipMascota;
        edad = this.edadMascota.getText();
        nombre =this.nombreMascota.getText();
        peso = this.pesoMascota.getText();
        //raza= this.razaMascota.getText();
        tamanio = (String) this.tamanioMascota.getSelectionModel().getSelectedItem();
        tipMascota=this.tipoMascota.toString();
        //PantallaRegController.muppy.agregarMascota(nombre,tamanio,raza,edad,peso,tipMascota);
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrincipal.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.botonFinalizar.getScene().getWindow();
        myStage.close();

    }

    @FXML
    void pantallaInicio(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("patallaRegistro.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.botonAtras.getScene().getWindow();
        myStage.close();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tamanioMascota.getItems().add("Pequeño");
        tamanioMascota.getItems().add("Mediano");
        tamanioMascota.getItems().add("Grande");
        razaMascota.getItems().add("Labrador");
        razaMascota.getItems().add("Pastor aleman");
        razaMascota.getItems().add("Poodlle");
        razaMascota.getItems().add("Golden retriever");
        razaMascota.getItems().add("Bóxer");
        razaMascota.getItems().add("Chihuahua");
        razaMascota.getItems().add("Bulldog");
    }

}