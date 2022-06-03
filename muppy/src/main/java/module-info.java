module com.example.muppy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.muppy to javafx.fxml;
    exports com.example.muppy;
    exports com.example.muppy.productos;
    opens com.example.muppy.productos to javafx.fxml;
}