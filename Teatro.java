package Estructura6AM;

import java.util.Scanner;

public class Teatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MetodosTeatro m = new MetodosTeatro();

        System.out.println("Ingese el tamaño del teatro NxN");
        int n = sc.nextInt();
        ObjPuesto[][] M = new ObjPuesto[n][n];
        M = m.LlenarMatrizCuadrada(n);
        m.MostrarMatriz(M);
    }
}
