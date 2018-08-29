package lecture103.argumentosVariables;

public class EjemploVarArgs {

    public static void main(String[] args) {
	

   }

    public static void imprimirNumeros(int... numeros) {
	// Recorremos cada elemento
	for (int i = 0; i < numeros.length; i++) {
	    System.out.println("Elemento " + i + numeros[i]);
	}
    }
    
    public static void imprimirNumerosForEach(int... numeros) {
	// Usamos forEach en lugar de un for normal
	for (int numero : numeros) {
	    System.out.println("El numero es: " + numero);
	}
    }
    
    public static void variosParametros (String nombre, boolean valido, int... numeros) {
	
    }
    
}
