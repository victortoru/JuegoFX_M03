module com.example.juegofx_m03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.juegofx_m03 to javafx.fxml;
    exports com.example.juegofx_m03;
}