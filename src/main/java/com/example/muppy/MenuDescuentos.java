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

public class MenuDescuentos {

    @FXML
    private ImageView menu;

    @FXML
    private ImageView EliminOloresProd;

    @FXML
    private ImageView RingoComida;

    @FXML
    private TextField buscar;

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
    void mostrarProducto(MouseEvent event) {

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
    void motraraRingoP(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("prductoRingoCom.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.RingoComida.getScene().getWindow();
        myStage.close();
    }

    @FXML
    void volverMenu(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrincipal.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.menu.getScene().getWindow();
        myStage.close();
    }

}
