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
import model.ProductoPerros;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ProductoRingoCom {
    static Producto[] vector;

    @FXML
    private Text botonAtras;

    @FXML
    private ImageView EliminOloresProd;

    @FXML
    private TextField buscar;

    @FXML
    private TextField cantidad;

    @FXML
    private ImageView carritoCompras;

    @FXML
    private Button comprar;

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
    void pantallaInicio(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuDescuentos.fxml"));
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
    void finalizarComprea(ActionEvent event) {
        String nombre = "Ringo";
        int precio = 5000;
        int cantidad = Integer.parseInt(this.cantidad.getText());
        boolean desc = true;
        Producto[] vector = {
                new ProductoPerros(nombre,precio,cantidad,desc)
        };

        agregardatos(vector, cantidad);

        CarroCompras compra = new CarroCompras();
        compra.compras = vector;
        System.out.println(cantidad);
        System.out.println(vector[0].nombre);
        double p = compra.compras[0].precioTotal;
        compra.total = compra.total + compra.compras[0].precioTotal;

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
        Stage myStage = (Stage) this.comprar.getScene().getWindow();
        myStage.close();
    }

    private void agregarPrecio(double vector) {
        String linea = String.valueOf(vector);
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

