module br.com.effecta {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens br.com.effecta to javafx.fxml;
    opens model.entities to javafx.base;
    opens gui to javafx.fxml;

    exports br.com.effecta;
}
