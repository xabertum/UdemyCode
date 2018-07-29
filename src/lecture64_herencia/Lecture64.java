package lecture64_herencia;


class Persona {
    
    String nombre;
    
    public Persona (String nombre) {
	this.nombre = nombre;
    }
}

public class Lecture64 extends Persona {

    double sueldo;
    
    public Lecture64 (String nombre, double sueldo) {
	super(nombre);
	this.sueldo = sueldo;
	
    }
    
    
    public static void main(String[] args) {
	Lecture64 lecture64 = new Lecture64("juan", 18000);

    }

}
