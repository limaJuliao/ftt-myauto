/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myauto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author kathe
 */
public class VeiculosController {
   @FXML
    ComboBox cbVeiculo, cbFabricante, cbModelo, cbDistancia;
    /**
     * Initializes the controller class.
     */
   
   public  void initialize() {
    // cbVeiculo.getItems().add("carro");
    // cbVeiculo.getItems().add( this.x );
     cbVeiculo.getItems().addAll("Carro", "Motocicleta", "Ônibus", "Caminhão");
     cbFabricante.getItems().addAll("Fiat", "Mercedez", "Volkswagen", "Chevrolet");
     cbModelo.getItems().addAll("Astra", "Palio", "Gol", "Fox");
     cbDistancia.getItems().addAll("Quilômetro", "Milhas" );
    // cbVeiculo.getSelectionModel().select("Option B");
     
    }    
    
}
