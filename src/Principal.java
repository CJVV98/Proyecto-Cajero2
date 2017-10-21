import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Principal {
// Creo una ventana detipo Jframe denominada obj1
	
	static VentanaJFrame obj1;
	public static void main(String[] args) {
		//la instancio y llamo su metodo constructor
		Usuario.lista = new ArrayList<Persona>(); 
		ventananuev();		
	}
	public static void ventananuev() {
		obj1 = new VentanaJFrame();
		
	}

}