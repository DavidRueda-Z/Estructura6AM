package Estructura6AM;

public class ObjVendedor {
    private String nombre;
    private double[] ventas;

    public ObjVendedor() {
        ventas = new double[12]; // Cada vendedor tiene 12 meses de ventas
    }

    public ObjVendedor(String nombre, double[] ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getVentas() {
        return ventas;
    }

    public void setVentas(double[] ventas) {
        this.ventas = ventas;
    }

    public double getTotalVentas() {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}