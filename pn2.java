package Estructura6AM;

import java.util.Scanner;

public class pn2 {

    public void punto2() {

        Metodosnuevos m = new Metodosnuevos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz: ");
        int d = sc.nextInt();
        ObjProducto[][] M = new ObjProducto[d][d];
        M = m.llenarmatrizObjetual(d);
        m.MostrarMatrizObjetual(M);
        System.out.println(" El inventario tiene: " + m.SumarInventario(M) + " productos en este momento.");

    }
}
