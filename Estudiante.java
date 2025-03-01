package Estructura6AM;

import java.util.Scanner;

public class Estudiante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MetodosEstudiante m = new MetodosEstudiante();

        System.out.println("Ingrese el tamaño de la matriz NxN: ");
        int d = sc.nextInt();

        ObjEstudiante[][] M = m.LlenarEstudiante(d);
        m.MostrarEstudiante(M);
        m.FiltrarYMostrarEstudiantes(M);

    }

}
