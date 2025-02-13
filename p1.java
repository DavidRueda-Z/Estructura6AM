package Estructura6AM;

public class p1 {

    public void sumarmatriz(int n) {

        Metodos m = new Metodos();
        int[][] M = m.LlenarMatriz(n);
        int suma = m.SumarMatriz(M);
        System.out.println("La matriz es: ");
        m.MostrarMatriz(M);
        System.out.println("La suma de la matriz es: " + suma);
    }
}
