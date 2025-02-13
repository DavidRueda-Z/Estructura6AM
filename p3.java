package Estructura6AM;

import java.util.Scanner;

public class p3 {

    public void sumarFilasColumnas(int n) { // n será el tamaño de la matriz
        // Primero creamos la matriz
        int[][] matriz = new int[n][n];
        // Vectores para guardar las sumas
        int[] sumaFilas = new int[n];
        int[] sumaColumnas = new int[n];

        // Primero llenamos la matriz (usando Scanner para el ejemplo)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Sumamos las filas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }
        // Mostramos resultados
        System.out.println("\nSuma de filas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        System.out.println("\nSuma de columnas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Columna " + (i + 1) + ": " + sumaColumnas[i]);
        }
    }

}
