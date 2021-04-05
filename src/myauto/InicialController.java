/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myauto;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXToggleButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kathe
 */
public class InicialController {

    @FXML
    public AnchorPane pnAbastecimento, pnServico, pnRelatorios, pnRota, pnReceita, pnDespesa, pnLembretes, pnMenu, pnAba, apUsuario;

    @FXML
    Pane pnUnica, pnFrequentemente, pnLogin;

    @FXML
    public JFXToggleButton tgFrequencia, tgQuilometragem, tgFreqUnica, tgFrequentemente, tgFrequencia1, tgQuilometragem1;

    @FXML
    public JFXDatePicker dtFreq, dtFreq1;

    @FXML
    public JFXTextArea txtOdometro, txtOdometro1, txtQtd;
    //pnMenu.setVisible(false);
    @FXML
    public JFXButton btnAbastecimento, btnServico, btnRelatorios, btnRota, btnReceita, btnDespesa, btnLembretes, bntAba, btnClose, btnSair;

    @FXML
    public ComboBox cbCombustivel, cbMotivoDespesa, cbTipoDespesa, cbFreq;

    @FXML
    public Button btnRegistrar2;

    public void initialize() {
        pnRelatorios.toFront();
        cbCombustivel.getItems().addAll("Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel");
        cbMotivoDespesa.getItems().addAll("Trabalho", "Passeio", "Obrigatória", "Melhoria", "Outro");
        cbTipoDespesa.getItems().addAll("Impostos", "Pedágios", "Passaportes", "Outro");
        cbFreq.getItems().addAll("Anos", "Meses", "Dias");
        btnRegistrar2.setVisible(true);

        pnUnica.setVisible(false);
        //dtFreq.setVisible(false);
        //txtOdometro.setVisible(false);
        //tgQuilometragem.setVisible(false);
        //tgFrequencia.setVisible(false);

        tgQuilometragem1.setVisible(false);
        tgFrequencia1.setVisible(false);
        cbFreq.setVisible(false);
        txtQtd.setVisible(false);
        pnFrequentemente.setVisible(false);
        dtFreq1.setVisible(false);
        txtOdometro1.setVisible(false);
    }

    /**
     * Initializes the controller class.
     *
     * @param <error>
     * @return
     */
    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == btnAbastecimento) {
            pnAbastecimento.toFront();
        }
        if (event.getSource() == btnServico) {
            pnServico.toFront();
        }
        if (event.getSource() == btnRelatorios) {
            pnRelatorios.toFront();
        }
        if (event.getSource() == btnLembretes) {
            pnLembretes.toFront();
        }
        if (event.getSource() == btnReceita) {
            pnReceita.toFront();
        }
        if (event.getSource() == btnDespesa) {
            pnDespesa.toFront();
        }
        if (event.getSource() == bntAba) {
            pnMenu.setVisible(true);
        }

        if (event.getSource() == btnClose) {
            pnMenu.setVisible(false);
        }
        /// PANE FREQUENCIA UNICA DE LEMBRETES
        if (event.getSource() == tgFreqUnica) {
            if (pnUnica.isVisible() == false) {
                pnUnica.setVisible(true);
                btnRegistrar2.setVisible(true);
                tgQuilometragem.setVisible(true);
                tgFrequencia.setVisible(true);
            } else {
                pnUnica.setVisible(false);
                btnRegistrar2.setVisible(true);
                tgQuilometragem.setVisible(false);
                tgFrequencia.setVisible(false);
            }
        }

        if (event.getSource() == tgQuilometragem) {
            if (txtOdometro.isVisible() == false) {
                txtOdometro.setVisible(true);
            } else {
                txtOdometro.setVisible(false);
            }
        }
        if (event.getSource() == tgFrequencia) {
            if (dtFreq.isVisible() == false) {
                dtFreq.setVisible(true);
            } else {
                dtFreq.setVisible(false);
            }
        }

        ///PANE FREQUENTEMENTE DE LEMBRETES
        if (event.getSource() == tgFrequentemente) {
            if (pnFrequentemente.isVisible() == false) {
                pnFrequentemente.setVisible(true);
                tgQuilometragem1.setVisible(true);
                tgFrequencia1.setVisible(true);
                btnRegistrar2.setVisible(true);
            } else {
                pnFrequentemente.setVisible(false);
                tgQuilometragem1.setVisible(false);
                tgFrequencia1.setVisible(false);
                btnRegistrar2.setVisible(true);
            }
        }

        if (event.getSource() == tgQuilometragem1) {
            if (txtOdometro1.isVisible() == false) {
                txtOdometro1.setVisible(true);
            } else {
                txtOdometro1.setVisible(false);
            }
        }
        if (event.getSource() == tgFrequencia1) {
            if (dtFreq1.isVisible() == false) {
                dtFreq1.setVisible(true);
                cbFreq.setVisible(true);
                txtQtd.setVisible(true);
            } else {
                dtFreq1.setVisible(false);
                cbFreq.setVisible(false);
                txtQtd.setVisible(false);
            }
        }
        if (event.getSource() == btnSair) {
            Parent root = FXMLLoader.load(getClass().getResource("Usuarios.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            btnSair.getScene().getWindow().hide();
            stage.show();
        }

    }

    @FXML

    public void initialize(URL url, ResourceBundle rb) {
    }

}
