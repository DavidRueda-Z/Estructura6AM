package Estructura6AM;

import java.util.Scanner;

public class Estanteria2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosEstanteria2 metodos = new MetodosEstanteria2();

        System.out.println("Ingrese el tamaño de la estantería NxN: ");
        int d = sc.nextInt();

        ObjProducto2[][] estanteria = metodos.LlenarEstanteria(d);

        System.out.println("\nEstantería completa:");
        metodos.MostrarEstanteria(estanteria);

        System.out.println("\nProductos separados por categoría:");
        metodos.FiltrarYMostrarProductos(estanteria);
    }
}
