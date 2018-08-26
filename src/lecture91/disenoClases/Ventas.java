package lecture91.disenoClases;

public class Ventas {

    public static void main(String[] args) {
	
	// Creamos varios objetos Producto
	Producto producto1 = new Producto("camisa", 50.00);
	Producto producto2 = new Producto("Pantalon", 100.00);
	Producto producto3 = new Producto("Corbata", 30.00);
	
	// Creamos un objeto Orden
	Orden orden1 = new Orden();
	
	// Agregamos los productos a la orden
	orden1.agregarProducto(producto1);
	orden1.agregarProducto(producto2);
	orden1.agregarProducto(producto3);
	
	// imprimimos la orden
	orden1.mostrarOrden();

    }

}
