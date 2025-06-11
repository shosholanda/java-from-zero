package com.pichu.app;

import com.pichu.app.App;

/**
 * Punto de inicio del programa. Podría estar dentro de App pero por
 * limpieza se separa el main de todas las demás clases.
 */
public class Main extends App {

    public static void main (String[] args){
	/* Todo se delega a la clase App */
	launch(args);
    }
}
