package com.example.muppy;

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
import model.Producto;
import model.ProductoGatos;
import model.ProductoPerros;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PantallaPetysElimOlor {

    @FXML
    private ImageView EliminOloresProd;

    @FXML
    private TextField buscar;

    @FXML
    private TextField cantidad;

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
    private Button buy;

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
    void finalBuy(ActionEvent event) {
        String nombre = "Petys Olor";
        int precio = 13200;
        int cantidad = Integer.parseInt(this.cantidad.getText());
        boolean desc = false;
        Producto[] vector = {
                new ProductoGatos(nombre,precio,cantidad,desc)
        };

        agregardatos(vector, cantidad);

        CarroCompras compra = new CarroCompras();
        compra.compras = vector;
        double p = compra.compras[0].precioTotal;

        agregarPrecio(p);

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("carroCompras.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        Stage myStage = (Stage) this.buy.getScene().getWindow();
        myStage.close();
    }

    private void agregarPrecio(double p) {
        String linea = String.valueOf(p);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("precios.txt",true);
            pw = new PrintWriter(fichero);
            pw.println(linea);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void agregardatos(Producto[] vector, int cantidad) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("prueba.txt",true);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < vector.length; i++)
                pw.println(vector[0].nombre+" "+cantidad);
            pw.println(vector[0].precioTotal);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
