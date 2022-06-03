package com.example.muppy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Producto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;

public class CarroCompras implements Initializable{
    /*ArrayList<String>productos=new ArrayList<>();
    ArrayList<String>precio=new ArrayList<>();*/
    public Producto[] compras;
    public double total = 0.0;
    @FXML
    private TextField buscar;

    @FXML
    private ImageView carritoCompras;

    @FXML
    private Button eliminarItem;

    @FXML
    private ListView listaCarrito;

    @FXML
    private ImageView perfil;

    @FXML
    private Text productosGato;

    @FXML
    private Text productosGenerales;

    @FXML
    private Text productosPerro;

    @FXML
    private Button realizarPago;

    @FXML
    private Text valorTotal;

    @FXML
    private Text veterinarias;

    @FXML
    private ImageView menu;


    @FXML
    void MostrarVeterinarias(MouseEvent event) {

    }

    @FXML
    void eliminarArticulo(ActionEvent event) {
        int indice;
        indice = listaCarrito.getSelectionModel().getSelectedIndex();
        String numero = null;
        if (indice != -1) {
            String clave = String.valueOf(listaCarrito.getItems().get(indice));
            String[] parts = clave.split("                                                      ");
            numero = parts[1];
            System.out.println(numero);
            listaCarrito.getItems().remove(indice);
        }

        // leer precios
        File archivos = null;
        FileReader frr = null;
        BufferedReader brr = null;

        double totalidad = 0;
        String preciototal = null;
        try {
            archivos = new File("precios.txt");
            frr = new FileReader(archivos);
            brr = new BufferedReader(frr);
            int i = 0;
            String linea;
            while ((linea = brr.readLine()) != null) {
                preciototal = linea;
                totalidad = Double.parseDouble(preciototal) + totalidad;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != frr) {
                    frr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //
        totalidad = totalidad - Double.parseDouble(numero) ;
        valorTotal.setText(String.valueOf(totalidad));

    }

    @FXML
    void mostrarCarrito(MouseEvent event) {

    }
    /*public void datos(ArrayList<String> producto,ArrayList<String> precio){
        this.productos=producto;
        this.precio=precio;
    }*/
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

    }

    @FXML
    void mostrarProductosGen(MouseEvent event) {

    }

    @FXML
    void mostrarProductosP(MouseEvent event) {

    }

    @FXML
    void realizarPago(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> lista1 = FXCollections.observableArrayList("Miringo 1", "Shampoo 2", "Safari 3");
        ObservableList<String> lista2 = FXCollections.observableArrayList("30000", "250000", "12000");

        //leer compras
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("prueba.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            int i = 0;
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                if (i == 0) {
                    lista1.add(linea);
                    i = 1;
                } else if (i == 1) {
                    lista2.add(linea);
                    i = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //
        for (int i = 0; i < lista1.size(); i++) {
            String mostrar = lista1.get(i) + lista2.get(i);
            listaCarrito.getItems().addAll(lista1.get(i) + "                                                      " + lista2.get(i));
        }

        // leer precios
        File archivos = null;
        FileReader frr = null;
        BufferedReader brr = null;

        double totalidad = 0;
        String preciototal = null;
        try {
            archivos = new File("precios.txt");
            frr = new FileReader(archivos);
            brr = new BufferedReader(frr);
            int i = 0;
            String linea;
            while ((linea = brr.readLine()) != null) {
                preciototal = linea;
                totalidad = Double.parseDouble(preciototal) + totalidad;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != frr) {
                    frr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //
        valorTotal.setText(String.valueOf(totalidad));

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
