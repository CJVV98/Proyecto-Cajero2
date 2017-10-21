/**
 * Esta clase se encarga de almacenar los datos de usuario
 * @author Corin Viracacha y Isaac Gomez
 */
public class  Persona {
	
	
	int cedula;
	float sueldo;
	int clave;
	String nombre;
	String apellido;

/**
 * Metodo constructor de la clase persona
 */
    public Persona(int i, String text, String text0, float f, int j) {
       this.nombre=text;
       this.apellido=text0;
       this.cedula=i;
       this.sueldo=f;
       this.clave=j;
    }
	/**
	 * Metodo para obtener nombre
	 */
    public String getNombre() {
        return nombre;
    }
	/**
	 * Metodo para establecer nombre
	 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	/**
	 * Metodo para obtener apellido
	 */

    public String getapellido() {
        return apellido;
    }
	/**
	 * Metodo para establecer apellido
	 */
    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
	/**
	 * Metodo para obtener cedula
	 */
    public int getcedula() {
        return cedula;
    }
	/**
	 * Metodo para establecer cedula
	 */
    public void setcedula(int cedula) {
        this.cedula = cedula;
    }
	/**
	 * Metodo para obtener clave
	 */
    public int getclave() {
        return clave;
    }
	/**
	 * Metodo para establecer clave
	 */
    public void setclave(int clave) {
        this.clave= clave;
    }

	/**
	 * Metodo para obtener sueldo
	 */
    public float getsueldo() {
        return sueldo;
    }
	/**
	 * Metodo para establecer sueldo
	 */
    public void setsueldo(float sueldo) {
        this.sueldo= sueldo;
    }

}