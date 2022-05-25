package Pedidos;

public class VentasTest {
    public static void main(String args[]){
        Orden O1 = new Orden(1);
        Producto P1 = new Producto(1,"Zapato01",150);
        O1.agregarProducto(P1);
        Producto P2 = new Producto(2,"Zapato02",150);
        O1.agregarProducto(P2);
        Producto P3 = new Producto(3,"Tenis01",200);
        O1.agregarProducto(P3);
        Producto P4 = new Producto(4,"Tenis02",200);
        O1.agregarProducto(P4);
        Producto P5 = new Producto(5,"Camisa01",150);
        O1.agregarProducto(P5);
        //Producto P6 = new Producto(6,"Camisa02",100);
        //O1.agregarProducto(P6);
        System.out.println(O1.mostrarOrden());
        System.out.println("El total de la orden es: Q"+O1.calcularTotal());
    }
}
