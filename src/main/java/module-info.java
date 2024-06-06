module com.cse.oop.studentprofilemaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse.oop.studentprofilemaker to javafx.fxml;
    exports com.cse.oop.studentprofilemaker;
}