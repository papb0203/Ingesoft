package com.example.muppy;

import com.example.muppy.productos.*;
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

import java.net.URL;
import java.util.ResourceBundle;

public class PantallaRegistrarVeterinaria implements Initializable{

    @FXML
    private ComboBox  amPmFin;

    @FXML
    private ComboBox  amPmIni;

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

    @FXML
    void pantallaInicio(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
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

    @FXML
    void pantallaRegistro(MouseEvent event) {
        String nombre, direccion,correo,contra,tel;
        boolean listo;
        nombre = this.nombreV.getText();
        direccion = this.direccionV.getText();
        correo = this.correoV.getText();
        contra = this.contraseniaV.getText();
        tel = this.telefonoV.getText();
        Veterinaria nueva = Veterinaria.getSingletonInstance(nombre,direccion,correo,contra,tel);

        SuperArchivo st= new SuperArchivo();

        st.addTarea(new EscribirInfo());

        ManejadorArchivo ma= new ManejadorArchivo();

        listo=st.ejecutar(correo,contra,"vet");
        System.out.println(listo);

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrincipal.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.botonEntrar.getScene().getWindow();
        myStage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        horaFin.getItems().add("5");
        horaFin.getItems().add("6");
        horaFin.getItems().add("7");
        horaFin.getItems().add("8");
        horaFin.getItems().add("9");
        horaIni.getItems().add("6");
        horaIni.getItems().add("7");
        horaIni.getItems().add("8");
        horaIni.getItems().add("9");
        horaIni.getItems().add("10");
        amPmFin.getItems().add("am");
        amPmFin.getItems().add("pm");
        amPmIni.getItems().add("am");
        amPmIni.getItems().add("pm");
    }
}
