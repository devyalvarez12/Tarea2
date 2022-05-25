package Pedidos;

public class Producto {
    int idProducto,contadorProductos=0;
    String nombre;
    int precio;

    public Producto( int idProducto, String nombre, int precio) {
        this.idProducto=idProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProductos++;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() +" - Producto{" +
                "idProducto="+ idProducto +
                "Nombre="+ nombre +
                "Precio=" + precio +
                "}";
    }

    public int getContadorProductos(){
        return contadorProductos;
    }

}
