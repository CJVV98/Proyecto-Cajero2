class Persona {
int cedula;
float sueldo;
int clave;
String nombre;
String apellido;
    public Persona(int i, String text, String text0, float f, int j) {
       this.nombre=text;
       this.apellido=text0;
       this.cedula=i;
       this.sueldo=f;
       this.clave=j;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }
    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getcedula() {
        return cedula;
    }
    
    public void setcedula(int cedula) {
        this.cedula = cedula;
    }
    
    public int getclave() {
        return clave;
    }
    
    public void setclave(int clave) {
        this.clave= clave;
    }

    
    public float getsueldo() {
        return sueldo;
    }
    
    public void setsueldo(float sueldo) {
        this.sueldo= sueldo;
    }

}