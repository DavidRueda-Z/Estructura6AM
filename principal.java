package Estructura6AM;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        int d = 0;
        System.out.println("Ingrese la dimension de la matriz: ");
        d = sc.nextInt();
        ObjPersona[][] M = new ObjPersona[d][d];
        M = m.llenarmatrizObjetual(d);
        m.MostrarMatrizObjetual(M);
        
    }
}