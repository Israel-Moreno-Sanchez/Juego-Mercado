module tech.cybersys.videojuego_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens tech.cybersys.videojuego_javafx to javafx.fxml;
    exports tech.cybersys.videojuego_javafx;
    exports tech.cybersys.videojuego_javafx.controlador;
    opens tech.cybersys.videojuego_javafx.controlador to javafx.fxml;
}