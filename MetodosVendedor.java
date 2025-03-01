package Estructura6AM;

import java.util.Scanner;

public class MetodosVendedor {
    Scanner sc = new Scanner(System.in);

    public ObjVendedor[] llenarVendedores() {
        ObjVendedor[] vendedores = new ObjVendedor[5]; // 5 vendedores

        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1) + ": ");
            String nombre = sc.next();

            double[] ventas = new double[12]; // 12 meses de ventas
            for (int j = 0; j < 12; j++) {
                System.out.println("Ingrese las ventas del mes " + (j + 1) + " para " + nombre + ": ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Valor incorrecto. Intente de nuevo: ");
                    sc.next();
                }
                ventas[j] = sc.nextDouble();
            }
            vendedores[i] = new ObjVendedor(nombre, ventas);
        }
        return vendedores;
    }

    public void mostrarVendedores(ObjVendedor[] vendedores) {
        System.out.println("\nVentas Anuales de los Vendedores:");
        for (ObjVendedor v : vendedores) {
            System.out.println("Vendedor: " + v.getNombre());
            System.out.println("Ventas totales: " + v.getTotalVentas());
            System.out.println("----------------------------");
        }
    }

    public void mejorVendedor(ObjVendedor[] vendedores) {
        ObjVendedor mejor = vendedores[0]; // Suponemos que el primero es el mejor al inicio

        for (int i = 1; i < vendedores.length; i++) {
            if (vendedores[i].getTotalVentas() > mejor.getTotalVentas()) {
                mejor = vendedores[i];
            }
        }

        System.out.println("\n🏆 El mejor vendedor del año es: " + mejor.getNombre());
        System.out.println("💰 Ventas totales: " + mejor.getTotalVentas());
    }
}