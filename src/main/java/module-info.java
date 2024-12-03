module com.example.personalfinance {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.personalfinance to javafx.fxml;
    exports com.example.personalfinance;

    opens PersonalFinance to javafx.fxml;
    exports PersonalFinance;

    opens HSClass to javafx.fxml;
    exports HSClass;
}