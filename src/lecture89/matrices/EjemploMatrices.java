package lecture89.matrices;

public class EjemploMatrices {

    public static void main(String[] args) {
	
	// Declaramos e instaciamos una matriz del objeto Persona;
	
	Persona personas[][] = new Persona [3][2];
	
	// Inicializamos los valores de la matriz de personas;
	
	personas[0][0] = new Persona("Juan");
	personas[0][1] = new Persona("Armando");
	personas[1][0] = new Persona("Karla");
	personas[1][1] = new Persona("Laura");
	personas[2][0] = new Persona("Pedro");
	personas[2][1] = new Persona("Javier");
	
	// Leemos los valores de cada elemento de la matriz
	
	for (int i = 0; i < personas.length; i++) {
	    for (int j = 0; j < personas[i].length; j++) {
		System.out.println("matriz personas indice: " + i + "-" + j + ": " + personas[i][j]);
	    }
	}

	
	
    }

}
