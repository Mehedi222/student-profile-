package com.cse.oop.studentprofilemaker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StudentController {

    @javafx.fxml.FXML
    private TextField nameTextField;

    @javafx.fxml.FXML
    private TextField idTextField;

    @javafx.fxml.FXML
    private DatePicker dobDatePicker;

    @javafx.fxml.FXML
    private RadioButton maleRadioButton;

    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;

    @javafx.fxml.FXML
    private ComboBox<String> nationalityComboBox;

    @javafx.fxml.FXML
    private TextArea displayTextArea;

    @javafx.fxml.FXML

    public void initialize(){
        nationalityComboBox.getItems().addAll("India","Aus","U.S.A","England","Newzealand","Bangladesh");
        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadioButton.setToggleGroup(toggleGroup);



    }

    @FXML
    void createProfileOnAction(ActionEvent event) {
        String name = nameTextField.getText();
        String id = idTextField.getText();
        String dob = dobDatePicker.getValue().toString();
        String nationality = nationalityComboBox.getValue();

        String gender;
        if(maleRadioButton.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }

        Student student = new Student(name,id,dob,nationality,gender);
        displayTextArea.appendText(student.toString());



    }

}
