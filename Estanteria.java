package Estructura6AM;

import java.util.Scanner;

public class Estanteria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MetodosEstanteria m = new MetodosEstanteria();

        System.out.println("Ingrese el tamaño de la estanteria NxN: ");
        int d = sc.nextInt();
        ObjEstanteria[][] M = new ObjEstanteria[d][d];
        M = m.LlenarEstanteria(d);

        System.out.println("\nEstanteria completa");
        m.MostrarEstanteria(M);

        ObjEstanteria[][] disponibles = m.EstanteriaDisp(M);

        System.out.println("\nEstanteria solo con productos disponibles: ");
        m.MostrarEstanteria(disponibles);

    }
}
