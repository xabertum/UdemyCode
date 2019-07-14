package SegundoCurso.lecture129.interfaces.datos;

public class ImplementacionOracle implements SegundoCurso.lecture129.interfaces.datos.AccesoDatos {

    @Override
    public void insertar () {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar () {
        System.out.println("Listar desde Oracle");
    }
}
