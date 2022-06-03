package com.example.muppy;

import com.example.muppy.productos.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class PantallaInicioSesionUG{

    @FXML
    private Text BotonAtras;

    @FXML
    private Text BotonIniciarSesion;

    @FXML
    private TextField contraseniaVerif;

    @FXML
    private TextField correoVerif;

    @FXML
    void pantallaInicioSesion(MouseEvent event) {
        String correo,contrasenia;
        boolean valido=false;
        correo=this.correoVerif.getText();
        contrasenia=this.contraseniaVerif.getText();
        SuperArchivo st= new SuperArchivo();

        st.addTarea(new EscribirInfo());

        ManejadorArchivo ma= new ManejadorArchivo();

        valido=st.ejecutar(correo,contrasenia,"vet");
        System.out.println(valido);

        if(valido == true) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrincipal.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Stage myStage = (Stage) this.BotonIniciarSesion.getScene().getWindow();
            myStage.close();
        }

    }

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
        Stage myStage = (Stage) this.BotonAtras.getScene().getWindow();
        myStage.close();
    }

}