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
                System.out.println("-------------------");
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

    public void FiltrarYMostrarEstudiantes(ObjEstudiante[][] m) {

        // Creo un vector que me almacene las notas, para evitar hacer 5 contadores con
        // 5 bucles para llenado
        String[] notas = { "A", "B", "C", "D", "E" };

        // Bucle for each que me recorre el vector sin necesidad de indices
        for (String nota : notas) {
            int contador = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j].getNota().equals(nota)) {
                        contador++;
                    }
                }
            }

            // Como estan dentro del primer bucle, creo una matriz cada que entro a un
            // filtro de nota
            ObjEstudiante[][] filtro = new ObjEstudiante[contador][1];
            int index = 0;

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j].getNota().equals(nota)) {
                        filtro[index][0] = m[i][j];
                        index++;
                    }
                }
            }

            if (contador > 0) {
                System.out.println("\nEstudiantes con nota " + nota + ":");
                for (int i = 0; i < filtro.length; i++) {
                    System.out.println("Nombre: " + filtro[i][0].getNombre());
                    System.out.println("Nota: " + filtro[i][0].getNota());
                    System.out.println("--------------");
                }
            }
        }
    }
}
