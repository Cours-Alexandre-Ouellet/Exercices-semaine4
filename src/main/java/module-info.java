module edu.uqtr.exercicessemaine4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.uqtr.exercicessemaine4 to javafx.fxml;
    exports edu.uqtr.exercicessemaine4;
}