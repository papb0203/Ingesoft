package com.example.muppy;

import com.example.muppy.productos.EscribirInfo;
import com.example.muppy.productos.ManejadorArchivo;
import com.example.muppy.productos.Registro;
import com.example.muppy.productos.SuperArchivo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Muppy;

import java.io.IOException;

public class PantallaRegController {

    @FXML
    private Text botonAtras;

    @FXML
    private Text botonEntrar;

    @FXML
    private TextField contrasenia;

    @FXML
    private TextField correo;

    @FXML
    private TextField direccion;

    @FXML
    private TextField nombre;

    @FXML
    private TextField telefono;

    @FXML
    private ToggleButton tipoUsuario;

    public static Muppy muppy = new Muppy();
    @FXML
    void pantallaRegistro(MouseEvent event) throws IOException {
        String contra, correo,direccion,nombre,telefono;
        contra = this.contrasenia.getText();
        correo = this.correo.getText();
        direccion = this.direccion.getText();
        nombre = this.nombre.getText();
        telefono = this.telefono.getText();
        muppy.agregarUsuario( nombre,contra,correo,telefono,direccion);
        SuperArchivo st = new SuperArchivo();
        st.addTarea(new EscribirInfo());
        new ManejadorArchivo();
        boolean listo = st.ejecutar(correo, contra, "vet");
        st.ejecutar2(nombre,correo,direccion,telefono,contra,"info");
        Registro registro= new Registro();
        Perfil perfil= new Perfil();
        registro.doAction(perfil);
        //System.out.println(perfil.getPerfil().toString());
        //perfil.datos(nombre,direccion,contra,telefono,correo);
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registrarMascota.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            ObservableList<String> items = FXCollections.observableArrayList();
            items.addAll("item-1", "item-2", "item-3", "item-4", "item-5");
            ComboBox tamanioMascota = new ComboBox(items);
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.botonEntrar.getScene().getWindow();
        myStage.close();
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
        Stage myStage = (Stage) this.botonAtras.getScene().getWindow();
        myStage.close();
    }
}
