package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class ConverterController {

        @FXML
        private TextField decimalNumber;

        @FXML
        private TextField binaryNumber;

        @FXML
        private TextField octalNumber;

        @FXML
        private TextField hexadecimalNumber;

        @FXML
        private void initialize() {
            decimalNumber.textProperty().bindBidirectional(binaryNumber.textProperty(), new modell.NumberConverter(10, 2));
            decimalNumber.textProperty().bindBidirectional(octalNumber.textProperty(), new modell.NumberConverter(10, 8));
            decimalNumber.textProperty().bindBidirectional(hexadecimalNumber.textProperty(), new modell.NumberConverter(10, 16));
        }

}



