module com.teste.testejunit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.teste.testejunit to javafx.fxml;
    exports com.teste.testejunit;
}