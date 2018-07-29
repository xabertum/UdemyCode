package lecture64_herencia;

class Persona {
    
    String nombre;
    
    public Persona (String nombre) {
	this.nombre = nombre;
    }
    
    @Override
    public String toString () {
	return "Persona { " + nombre + " } ";
    }
    
}

public class Lecture64 extends Persona {

    double sueldo;
    
    public Lecture64 (String nombre, double sueldo) {
	super(nombre);
	this.sueldo = sueldo;
	
    }
    
    @Override
    public String toString () {
	return super.toString() + "Lecture64 { " + sueldo + " }";
    }
    
    
    public static void main(String[] args) {
	Lecture64 lecture64 = new Lecture64("juan", 18000);
	System.out.println(lecture64.toString());

    }

}
