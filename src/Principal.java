
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * Esta clase principal me crea el JFrame inicial
 * @author Corin Viracacha y Isaac Gomez
 */

public class Principal {
// Creo una ventana detipo Jframe denominada obj1
	
	static VentanaJFrame obj1;
	/**
	 * Metodo main
	 */
	public static void main(String[] args) {
		//la instancio y llamo su metodo constructor
		Usuario.lista = new ArrayList<Persona>(); 
		ventananuev();		
	}
	/**
	 * Metodo para llamar a una nueva ventanaJframe
	 */
	public static void ventananuev() {
		obj1 = new VentanaJFrame();
		
	}

}