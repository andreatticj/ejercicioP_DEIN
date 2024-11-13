package eu.andreatt.ejerciciop_dein.controllers;

import eu.andreatt.ejercicioo_dein.application.ProductoLabel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase que controla los eventos de la ventana
 */
public class PController implements Initializable {
    @FXML // fx:id="product1"
    private ProductoLabel product1; // Value injected by FXMLLoader

    @FXML // fx:id="product2"
    private ProductoLabel product2; // Value injected by FXMLLoader

    @FXML // fx:id="product3"
    private ProductoLabel product3; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se carga la ventana
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Producto 1
        product1.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciop_dein/images/pan.png")));
        product1.setName("Pan");
        product1.setStock(10);
        // Producto 2
        product2.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciop_dein/images/manzana.png")));
        product2.setName("Manzana");
        product2.setStock(200);
        // Producto 3
        product3.setImage(new Image(getClass().getResourceAsStream("/eu/andreatt/ejerciciop_dein/images/leche.png")));
        product3.setName("Leche");
        product3.setStock(50);
    }

}