package com.pichu.app;

/* FXML */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

/**
 * Aplicacion de ejemplo de contador de clicks
 */
public class App extends Application {

    /* Vista de la interfaz de aplicacion */
    public static final String FXML_PATH = "fxml/Baby Penguin/";

    /**
     * Ejecuta este método como parte de launch(args)
     * @param stage la ventana principal de la aplicación.
     * @throws Exception si algo sale mal.
     */
    @Override
    public void start(Stage stage) throws Exception {

	ClassLoader cl = getClass().getClassLoader();

	FXMLLoader fxml = new FXMLLoader(cl.getResource(FXML_PATH + "L01.fxml"));
	ScrollPane marco = (ScrollPane)fxml.load();
        Scene scene = new Scene(marco, 700, 600);

        stage.setTitle("L01");
        stage.setScene(scene);
        stage.show();
    }
}
