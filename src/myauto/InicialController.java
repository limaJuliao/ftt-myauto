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
        public AnchorPane pnReabastecimento, pnServico, pnDespesa, pnRota, pnRenda,pnLembrete;
 @FXML
        public JFXButton btnReabastecimento, btnServico, btnDespesa,btnRota,btnRenda,btnLembrete;
    /**
     * Initializes the controller class.
     */
 @FXML
        public void handleButtonAction(ActionEvent Event){
            
            if(Event.getSource()== btnReabastecimento){
                pnReabastecimento.toFront();
            }
            else{
                if(Event.getSource()== btnServico){
                pnServico.toFront();
            }
                if(Event.getSource()== btnDespesa){
                pnDespesa.toFront();
            }
                if(Event.getSource()== btnRota){
                pnRota.toFront();
            }
                 if(Event.getSource()== btnRenda){
                pnRenda.toFront();
            }
            }
        }
        
  @FXML
         
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
