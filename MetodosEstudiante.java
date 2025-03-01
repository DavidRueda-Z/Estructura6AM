package Estructura6AM;

import java.util.Scanner;

public class MetodosEstudiante {

    Scanner sc = new Scanner(System.in);

    public ObjEstudiante[][] LlenarEstudiante(int d) {
        // Creo la matriz
        ObjEstudiante[][] m = new ObjEstudiante[d][d];

        // for
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                // Creo el objeto para guardar datos
                ObjEstudiante obj = new ObjEstudiante();

                System.out.println("Ingrese el nombre del estudiante: ");
                obj.setNombre(sc.next());

                System.out.println("Ingrese la nota del estudiante ");
                System.out.println("A, B, C, D, E");
                String not = sc.next().toUpperCase();
                while (!not.equals("A") && !not.equals("B") && !not.equals("C") && !not.equals("D")
                        && !not.equals("E")) {
                    System.out.println("Dato erroneo, digite de nuevo");
                    not = sc.next();
                }

                obj.setNota(not);
                m[i][j] = obj;
            }
        }
        return m;
    }

    public void MostrarEstudiante(ObjEstudiante[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Nota: " + m[i][j].getNota());

            }
        }
    }
}
