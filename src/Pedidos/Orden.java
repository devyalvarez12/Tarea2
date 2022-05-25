package Pedidos;

public class Orden {
int idOrden;
int contadorOrdenes=0, contadorProductosAgregados=0;
int MAX_PRODUCTOS=5;
Producto[] productoDeOrden = new Producto[MAX_PRODUCTOS+1];

public Orden (int idOrden) {
    this.idOrden=idOrden;
    contadorOrdenes++;
}

public int calcularTotal() {
    int total=0;
    for (int j=1; j< contadorProductosAgregados+1; j++){
        total = (productoDeOrden[j].precio + total);
    }
    return total;
}
public String mostrarOrden() {
    String productosList="";

    for (int i=1; i< contadorProductosAgregados+1; i++){
        productosList = productosList +"\n"+ "[Producto"+(i)+"]{"+
                " idProducto= "+productoDeOrden[i].idProducto+
                " Nombre="+productoDeOrden[i].nombre+
                " Precio="+productoDeOrden[i].precio+
                "}";
    }
    return super.toString()+" - Orden{"+
            " contadorOrden="+contadorOrdenes+
            " idOrden="+ idOrden +
            " Productos="+productosList+
    " }";
}

public void agregarProducto(Producto P1) {
    if (contadorProductosAgregados+1 <= this.MAX_PRODUCTOS) {
        this.contadorProductosAgregados++;
        this.productoDeOrden[contadorProductosAgregados] = P1;
    }
    else
    {
        System.out.println("Error: Se excede el máximo de productos por orden...");
        System.exit(0);
    }
};

public int getContadorProductosAgregados(){
    return contadorProductosAgregados;
    }

public void setContadorProductosAgregados(int contadorProductosAgregados){
    this.contadorProductosAgregados=contadorProductosAgregados;
}

public int getContadorOrdenes(){
    return contadorOrdenes;
}

public void setContadorOrdenes(int contadorOrdenes){
    this.contadorOrdenes=contadorOrdenes;
}



}
