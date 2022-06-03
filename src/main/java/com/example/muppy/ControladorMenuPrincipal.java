package com.example.muppy;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControladorMenuPrincipal {

    @FXML
    private TextField buscar;

    @FXML
    private Text descuentos;

    @FXML
    private ImageView carritoCompras;

    @FXML
    private ImageView perfil;

    @FXML
    private Text productosGato;

    @FXML
    private Text productosGenerales;

    @FXML
    private Text productosPerro;

    @FXML
    private Text veterinarias;

    @FXML
    void MostrarVeterinarias(MouseEvent event) {

    }

    @FXML
    void mostrarCarrito(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("carroCompras.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.carritoCompras.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void mostrarPerfil(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("perfil.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.perfil.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void mostrarProductosG(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("productosGato.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.productosGato.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void mostrarProductosGen(MouseEvent event) {

    }

    @FXML
    void mostrarProductosP(MouseEvent event) {

    }

    @FXML
    void mostrarDescuentos(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuDescuentos.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.descuentos.getScene().getWindow();
        myStage.close();
    }

}
