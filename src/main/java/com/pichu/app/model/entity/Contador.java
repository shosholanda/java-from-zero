package com.pichu.app.model.entity;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Clase que representa un contador de clicks.  Usamos
 * propiedades observables debido a que estos objetos
 * cambian con alguna interacción del usuario. Un tipo de
 * dato "int" no tiene la capacidad de "escuchar", pero los
 * Property sí. Todo objeto que sea accionable (por usuario)
 * debería estar en un property.
 *
 * Esto separa bien el modelo de la interfaz, usando el
 * controlador como intermediario único.
 */
public class Contador {

    /* Clase abstracta de un "int" observable */
    private final IntegerProperty totalClicks;

    /** Constructor: Crea un nuevo objeto "int" observable */
    public Contador() {
	totalClicks = new SimpleIntegerProperty();
    }

    /**
     * Regresa el número de clicks almacenados.
     * @return el número de clicks.
     */
    public int getClicks(){
	return totalClicks.get();
    }

    /**
     * Suma en 1 el número de clicks
     */
    public void click(){
	totalClicks.set(totalClicks.get() + 1);
    }

    /**
     * Regresa el contador como objeto observable
     * @return el contador como objeto observable.
     */
    public IntegerProperty asProperty(){
	return totalClicks;
    }
    
}
