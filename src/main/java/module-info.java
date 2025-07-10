module br.com.effecta {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.effecta to javafx.fxml;
    exports br.com.effecta;
}
