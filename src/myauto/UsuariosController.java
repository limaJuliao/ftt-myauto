/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myauto;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import static java.awt.SystemColor.window;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kathe
 */
public class UsuariosController {

    @FXML
    public AnchorPane pnLogin, pnCriar, pnVeiculos, apUsuario;
    @FXML
    public Button btnCriar, btnAcessar, btnRegistrar, btnVoltarCriar, btnVoltarLogin;

    @FXML
    public Hyperlink hpPossui, hpEsquecer, hpCriar;
    @FXML
    JFXComboBox cbVeiculo, cbFabricante, cbModelo, cbDistancia;

    @FXML
    public void initialize() {
        // cbVeiculo.getItems().add("carro");
        // cbVeiculo.getItems().add( this.x );
        cbVeiculo.getItems().addAll("Carro", "Motocicleta", "Ônibus", "Caminhão");
        cbFabricante.getItems().addAll("Fiat", "Mercedez", "Volkswagen", "Chevrolet");
        cbModelo.getItems().addAll("Astra", "Palio", "Gol", "Fox");
        //cbDistancia.getItems().addAll("Quilômetro", "Milhas" );
        // cbVeiculo.getSelectionModel().select("Option B");
        pnLogin.toFront();
    }

    @FXML
    public void start() throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("Usuarios.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("Usuarios.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.close();

    }

    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException, Exception {
        if (event.getSource() == hpPossui) {
            pnLogin.toFront();
        }
        if (event.getSource() == hpCriar) {
            pnCriar.toFront();
        }
        if (event.getSource() == btnCriar) {
            pnVeiculos.toFront();
        }
        if (event.getSource() == btnVoltarCriar) {
            pnCriar.toFront();
        }
        if (event.getSource() == btnVoltarLogin) {
            pnLogin.toFront();
        }
        if (event.getSource() == btnAcessar) {
            Parent root = FXMLLoader.load(getClass().getResource("Inicial.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            btnRegistrar.getScene().getWindow().hide();
            stage.show();

            start();
        }
        if (event.getSource() == btnRegistrar) {
            Parent root = FXMLLoader.load(getClass().getResource("Inicial.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            btnRegistrar.getScene().getWindow().hide();
            start();

        }
    }

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
