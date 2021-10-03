package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * {@code ConverterController}A screen-en megjelenő vizuális eszközökkel történő műveletek, események itt történnek kezelésre(eventek), továbbá
 * itt tudunk módosítani a képernyő tartalmán.
 *
 */

public class ConverterController {

        /**
         * {@code decimalNumber, binaryNumber, octalNumber, hexadecimalNumber}
         * Példányositjuk a képetrnyőn látható textfieldeket, amikre ezután tudunk hivatkozni a
         * programkódban.
         */

        @FXML
        private TextField decimalNumber;

        @FXML
        private TextField binaryNumber;

        @FXML
        private TextField octalNumber;

        @FXML
        private TextField hexadecimalNumber;

        /**
        * {@code initialize()}Ez a metódus fut le először, a konstruktorhoz nagyon hasonló, azonban innen elérjük az fxml fájl tagjait.
         * Továbbá itt történik a model osztályunk felhasználása, ami felelős a számrendszerek átváltásáért.
        */
        @FXML
        private void initialize() {
            decimalNumber.textProperty().bindBidirectional(binaryNumber.textProperty(), new model.NumberConverter(10, 2));
            decimalNumber.textProperty().bindBidirectional(octalNumber.textProperty(), new model.NumberConverter(10, 8));
            decimalNumber.textProperty().bindBidirectional(hexadecimalNumber.textProperty(), new model.NumberConverter(10, 16));
        }

}



