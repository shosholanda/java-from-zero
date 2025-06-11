package com.pichu.app.controller;

import com.pichu.app.model.entity.Contador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

/**
 * Controlador de ejemplo para el contador de clicks. Naturalmente
 * cada VISTA al usuario debe tener su controlador al MODELO.
 */
public class CtrlExample {

    /* Objeto que lleva la cuenta */
    private Contador contador;

    /* FXML elements */
    @FXML private Label etiqueta;
    @FXML private Button boton;

    /* Constructor del controlador mediante JAVAFX */
    @FXML private void initialize(){
	this.contador = new Contador();
	// Cada vez que haya un cambio en "contador" (i++), se ejecutará
	// esta lambda. c = contador, v = old value, n = new value
	this.contador.asProperty()
	    .addListener(
	        // Reemplaza este título por esta informacion
		(c, v, n) -> this.etiqueta.setText(n.toString() + " clicks")
			 );
    }


    /**
     * Método que se ejecuta al momento de hacer click, #click
     * Como cambiamos el valor del property, se ejecuta la lambda
     * que actualiza la etiqueta. Este cambio genera el  otro cambio.
     */
    @FXML private void click(ActionEvent action){
	// Cambia el contador de clicks
	this.contador.click();
	// i++ -> hubo cambio en el modelo -> actualiza la etiqueta.
    }


    
    


}
