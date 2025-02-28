package Estructura6AM;

public class ObjEstanteria {

    private String nombre;
    private double precio;
    private boolean disponible;

    public ObjEstanteria(String nombre, double precio, boolean disponible) {

        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public ObjEstanteria() {
    }

}