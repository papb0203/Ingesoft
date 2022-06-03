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
        String perf="si";
        boolean valido = false;
        String correo = this.correoVerif.getText();
        String contrasenia = this.contraseniaVerif.getText();
        SuperArchivo st = new SuperArchivo();
        st.addTarea(new EscribirInfo());
        new ManejadorArchivo();
        valido = st.ejecutar(correo, contrasenia, "vet");
        System.out.println(valido);
        Perfil perfil= new Perfil();
        InicioSesion inicio=new InicioSesion();
        inicio.doAction(perfil);
        //System.out.println(perfil.getPerfil().toString());

        if (valido) {
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