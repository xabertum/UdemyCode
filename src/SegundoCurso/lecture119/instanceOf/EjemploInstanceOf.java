package SegundoCurso.lecture119.instanceOf;

public class EjemploInstanceOf {

    public static void main (String [] args) {
        FiguraGeometrica figuraGeometrica = new ELipse();

        // DEtermina solo un tipo el que corresponda con la jerarquia
        determinaTipo(figuraGeometrica);
        // Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos: ");
        determinaTodosLosTipos(figuraGeometrica);


    }

    private static void determinaTodosLosTipos(FiguraGeometrica figuraGeometrica) {
        if (figuraGeometrica instanceof ELipse) {
            // Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }

        if (figuraGeometrica instanceof Circulo) {
            // Procesa algo particular del Circulo
            System.out.println("Es un circulo");
        }

        if (figuraGeometrica instanceof FiguraGeometrica) {
            // Procesa algo particular de la FiguraGeometrica
            System.out.println("Es una FiguraGeometrica");
        }

        if (figuraGeometrica instanceof Object) {
            // Procesa algo particular de la clase Object
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontró el tipo");
        }
    }

    private static void determinaTipo(FiguraGeometrica figuraGeometrica) {
    }
}
