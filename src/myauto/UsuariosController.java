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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author kathe
 */
public class UsuariosController {

    @FXML
        public AnchorPane pnLogin, pnCriar;
    @FXML
        public Button btnCriar, btnAcessar;
    
    @FXML
        public Hyperlink hpPossui, hpEsquecer, hpCriar;
    
    @FXML
        public void handleButtonAction(ActionEvent event){
            if(event.getSource()== hpPossui){
                pnLogin.toFront();
            }
           if(event.getSource()== hpCriar){
                pnCriar.toFront();
            }
        }
    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
