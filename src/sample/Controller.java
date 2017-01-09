package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.Map;


public class Controller {
    @FXML private TextField textField;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;
    @FXML private Button button0;
    @FXML private Button pointButton;
    @FXML private Button equalButton;
    @FXML private Button plusButton;
    @FXML private Button minusButton;
    @FXML private Button multiplyButton;
    @FXML private Button divideButton;

    @FXML
    protected void button1 (ActionEvent event){

        textField.setText(setCalcText(textField, button1));
    }
    @FXML
    protected void button2 (ActionEvent event){
        textField.setText(setCalcText(textField, button2));
    }

    @FXML
    protected void button3 (ActionEvent event) {
        textField.setText(setCalcText(textField, button3));
    }

    @FXML
    protected void button4 (ActionEvent event) {
        textField.setText(setCalcText(textField, button4));
    }

    @FXML
    protected void button5 (ActionEvent event) {
        textField.setText(setCalcText(textField, button5));
    }

    @FXML
    protected void button6 (ActionEvent event) {
        textField.setText(setCalcText(textField, button6));
    }

    @FXML
    protected void button7 (ActionEvent event) {
        textField.setText(setCalcText(textField, button7));
    }

    @FXML
    protected void button8 (ActionEvent event) {
        textField.setText(setCalcText(textField, button8));
    }

    @FXML
    protected void button9 (ActionEvent event) {
        textField.setText(setCalcText(textField, button9));
    }

    @FXML
    protected void button_0 (ActionEvent event) {
        textField.setText(setCalcText(textField, button0));
    }

    @FXML
    protected void button_point (ActionEvent event) {
        textField.setText(setCalcText(textField, pointButton));
    }

    @FXML
    protected void button_equal (ActionEvent event) {
        textField.setText(setCalcText(textField, equalButton));
    }

    @FXML
    protected void button_plus (ActionEvent event) {
        textField.setText(setCalcText(textField, plusButton));
    }

    @FXML
    protected void button_minus (ActionEvent event) {
        textField.setText(setCalcText(textField, minusButton));

    }

    @FXML
    protected void button_multiply (ActionEvent event) {
        textField.setText(setCalcText(textField, multiplyButton));
    }

    @FXML
    protected void button_divide (ActionEvent event) {
        textField.setText(setCalcText(textField, divideButton));
    }

    @FXML
    protected void cancelBut(ActionEvent event){
        textField.clear();
    }

    private String setCalcText (TextField text, Button getButtonText) {
        String calcText = null;
        String textF = text.getText();
        if (textF != null) {
            calcText = textF + getButtonText.getText();
        }
        return calcText;
    }
    private String eqals (TextField text) {
        String txt = text.getText();
        ArrayList plus = new ArrayList();
        int [] minus;
        int [] mult;
        int [] div;

        while (txt.contains("+")||txt.contains("-")||txt.contains("/")||txt.contains("*"))
            while (txt.contains("+")) {
            plus.add(txt.indexOf("+"));
            //todo Дописать реализацию выбора цифр и операторов сложения, умноженияб и.т.д.txt.
            }

        if (txt.contains("-")){

        }
        if (txt.contains("*")){

        }
        if (txt.contains("/")){

        }


        return text.getText();
    }
}
