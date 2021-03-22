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
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author kathe
 */
public class InicialController implements Initializable {
        @FXML
        public AnchorPane pnAbastecimento, pnServico, pnRelatorios, pnRota, pnReceita,pnLembretes;
 @FXML
        public JFXButton btnAbastecimento, btnServico, btnRelatorios,btnRota,btnReceita,btnLembretes;
    /**
     * Initializes the controller class.
     */
 @FXML
        public void handleButtonAction(ActionEvent Event){
            
            if(Event.getSource()== btnAbastecimento){
                pnAbastecimento.toFront();
            }
            else{
                if(Event.getSource()== btnServico){
                pnServico.toFront();
            }
                if(Event.getSource()== btnRelatorios){
                pnRelatorios.toFront();
            }
                if(Event.getSource()== btnLembretes ){
                pnLembretes.toFront();
            }
                 if(Event.getSource()== btnReceita){
                pnReceita.toFront();
            }
            }
        }
        
  @FXML
         
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
