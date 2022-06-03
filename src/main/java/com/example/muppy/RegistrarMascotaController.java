package com.example.muppy;

import java.net.URL;
import java.util.ResourceBundle;
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

    public RegistrarMascotaController() {
    }

    @FXML
    void pantallaRegistro(MouseEvent event) {
        String edad = this.edadMascota.getText();
        String nombre = this.nombreMascota.getText();
        String peso = this.pesoMascota.getText();
        String tamanio = (String)this.tamanioMascota.getSelectionModel().getSelectedItem();
        String tipMascota = this.tipoMascota.toString();

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("menuPrincipal.fxml"));
            Parent root1 = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception var11) {
            var11.printStackTrace();
        }

        Stage myStage = (Stage)this.botonFinalizar.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void pantallaInicio(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("patallaRegistro.fxml"));
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

    public void initialize(URL location, ResourceBundle resources) {
        this.tamanioMascota.getItems().add("Pequeño");
        this.tamanioMascota.getItems().add("Mediano");
        this.tamanioMascota.getItems().add("Grande");
        this.razaMascota.getItems().add("Labrador");
        this.razaMascota.getItems().add("Pastor aleman");
        this.razaMascota.getItems().add("Poodlle");
        this.razaMascota.getItems().add("Golden retriever");
        this.razaMascota.getItems().add("Bóxer");
        this.razaMascota.getItems().add("Chihuahua");
        this.razaMascota.getItems().add("Bulldog");
    }
}
