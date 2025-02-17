package Estructura6AM;

public class ObjProducto {

    private String nombre;
    private long precio;
    private long cantidad;
     //long = entero que permite capturar mas de 7 caracteres numericos


    public ObjProducto(String nombre, long precio, long cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //Set es para asignar un valor a la variable nombre
        this.nombre = nombre;
    }



    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }



    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }


    public ObjProducto() {
    }
}


