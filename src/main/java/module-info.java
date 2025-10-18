module ahmed.lab5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ahmed.lab5colorchooser to javafx.fxml;
    exports ahmed.lab5colorchooser;
}