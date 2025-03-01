
package Estructura6AM;

public class Vendedor {
    public static void main(String[] args) {
        MetodosVendedor metodos = new MetodosVendedor();

        // Llenar la matriz de vendedores
        ObjVendedor[] vendedores = metodos.llenarVendedores();

        // Mostrar todas las ventas
        metodos.mostrarVendedores(vendedores);

        // Determinar el mejor vendedor
        metodos.mejorVendedor(vendedores);
    }
}