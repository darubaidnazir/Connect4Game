package com.darubaidnazir.connectfour;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        @FXML
        public GridPane rootGridPane;
        @FXML
        public Pane rootPane;
        @FXML
        public Pane rootpane2;
        @FXML
        public VBox  rootVbox;


    }
}
