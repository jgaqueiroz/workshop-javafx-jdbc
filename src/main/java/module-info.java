module br.com.effecta {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.effecta to javafx.fxml;
    opens gui to javafx.fxml;

    exports br.com.effecta;
}
