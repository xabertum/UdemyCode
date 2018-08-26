package lecture91.disenoClases;

public class Orden {

    private final int idOrden;
    private final Producto productos [];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAXPRODUCTOS = 10;
    
    public Orden() {
	this.idOrden = ++contadorOrdenes;
	productos = new Producto[MAXPRODUCTOS];
    }
    
    
    
}
