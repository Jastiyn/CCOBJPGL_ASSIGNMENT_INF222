package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinksController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Goodday goodday = new Goodday();
    Milkshake milkshake = new Milkshake();
    Milktea milktea = new Milktea();
    Soju soju = new Soju();
    Thebar thebar = new Thebar();

    public void initialize() {

        goodday.setColor("Good Day: ");
        goodday.setTaste("Perfect blend of sweet and sour - 9/10");

        milkshake.setColor("Milk Shake: ");
        milkshake.setTaste("So creamy and sweet - 10/10");

        milktea.setColor("Milk Tea: ");
        milktea.setTaste("Very sweet - 8.5/10");

        soju.setColor("Soju: ");
        soju.setTaste("Great blend of bitter and sweet - 8/10");

        thebar.setColor("The Bar: ");
        thebar.setTaste("Fruity taste - 7/10");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText(milkshake.getColor() +  milkshake.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText(goodday.getColor() + goodday.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText(soju.getColor() + soju.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText(thebar.getColor() + thebar.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText(milktea.getColor() + milktea.getTaste());
        }

        alert.showAndWait();

    }
}