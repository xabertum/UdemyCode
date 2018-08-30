package SegundoCurso.lecture104.enumeraciones;

public class EjemploEnum {

    public static void main (String [] args) {
        // Valores de la enumeracion
        System.out.println("Valor 1: " + Dias.LUNES);

        // Hacemos un test del dia utilizado
        indicarDia(Dias.VIERNES);


    }

    public static void indicarDia (Dias dias) {
        switch (dias) {
            // Podemos usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }


}
