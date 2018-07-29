package lecture64_herencia;

/**
 * @author xabertum
 *
 */
public class EjemploHerencia {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Empleado empleado1 = new Empleado("Juan", 18000);
	System.out.println("imprimimos el objeto Empleado1");
	System.out.println(empleado1);
	
	Empleado empleado2 = new Empleado("Pedro", 25000);
	empleado2.setEdad(28);
	empleado2.setGenero('M');
	empleado2.setDireccion("Bogota, Colombia");
	System.out.println("imprimimos el objeto Empleado2");
	System.out.println(empleado2);
	
	
	
	
	
	

    }

}
