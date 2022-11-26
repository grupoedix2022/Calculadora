package controlador;

import vista.VentanaCalculadora;

public class Main {

	public static void main(String[] args) {
		VentanaCalculadora ventana = new VentanaCalculadora();
		ManejadorEventos manejador = new ManejadorEventos(ventana);
		ManejadorRaton raton = new ManejadorRaton(ventana);
		ventana.setManejador(manejador);
		ventana.setManejadorRaton(raton);
	}

}
