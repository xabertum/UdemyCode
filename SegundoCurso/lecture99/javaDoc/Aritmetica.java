package lecture99.javaDoc;


/**
 * Esta clase permite realizar operaciones de arimetica basica.
 * 
 * @author Javier Delgado
 * @version 1.0
 *
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    int operandoA;
        
    /**
     * Segundo operando
     */
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     */
    public Aritmetica() {
	// TODO Auto-generated constructor stub
    }
    
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar() {
	return operandoA + operandoB;
    }
}