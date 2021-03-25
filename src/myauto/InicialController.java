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
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author kathe
 */
public class InicialController  {
    
        @FXML
        public AnchorPane pnAbastecimento, pnServico, pnRelatorios, pnRota, pnReceita, pnDespesa, pnLembretes, pnMenu, pnAba;
         //pnMenu.setVisible(false);
        @FXML
        public JFXButton btnAbastecimento, btnServico, btnRelatorios,btnRota,btnReceita,btnDespesa,btnLembretes, bntAba, btnClose;
        
        @FXML
         public ComboBox cbCombustivel;
        
        
         public  void initialize() {
             cbCombustivel.getItems().addAll("Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel");
     
    }    
    /**
     * Initializes the controller class.
     * @param <error>
     * @return 
     */
 
       
 @FXML
        public void handleButtonAction(ActionEvent event){
            
            if(event.getSource()== btnAbastecimento){
                pnAbastecimento.toFront();
            }
            else{
                if(event.getSource()== btnServico){
                pnServico.toFront();
            }
                if(event.getSource()== btnRelatorios){
                pnRelatorios.toFront();
            }
                if(event.getSource()== btnLembretes ){
                pnLembretes.toFront();
            }
                if(event.getSource()== btnReceita){
                pnReceita.toFront();
            }
                if(event.getSource()== btnDespesa){
                pnDespesa.toFront();
            }                 
                 if (event.getSource()==bntAba){
                     pnMenu.setVisible(true);
                 }
                  if (event.getSource()==btnClose){
                     pnMenu.setVisible(false);
                 }
                
            }
        }
        
  @FXML
         
    public void initialize(URL url, ResourceBundle rb) {
            // TODO
    }    
    
    
}
