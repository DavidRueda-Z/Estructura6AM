package Estructura6AM;

import java.util.Scanner;

public class PrincipalMatrizNC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodosnuevos m = new Metodosnuevos();

        int filas = 0, columnas = 0, filas1 = 0, columnas1 = 0;

        System.out.println("Ingrese las filas de la matriz 1: ");
        filas = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 1: ");
        columnas = sc.nextInt();

        ObjProducto[][] M1 = new ObjProducto[filas][columnas];
        M1 = m.LlenarMatrizNC(filas, columnas);

        System.out.println("Ingrese las filas de la matriz 2: ");
        filas1 = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 2: ");
        columnas1 = sc.nextInt();

        ObjProducto[][] M2 = new ObjProducto[filas1][columnas1];
        M2 = m.LlenarMatrizNC(filas1, columnas1);

        System.out.println("Matriz 1");
        m.MostrarMatrizObjetual(M1);
        System.out.println("Matriz 2");
        m.MostrarMatrizObjetual(M2);

        ObjProducto[][] resultado = m.SumarMatricesObj(M1, M2);

        System.out.println("\n Matriz Resultante: ");
        m.MostrarMatrizObjetual(resultado);
    }
}
