package Estructura6AM;

public class p2 {

    public void nmmayor(int n) {

        Metodos m = new Metodos();
        int[][] M = m.LlenarMatriz(n);
        int nm = m.NumeroMayor(M);
        m.MostrarMatriz(M);

        int mayor = 0;
        int posi = 0;
        int posj = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] > mayor) {
                    mayor = M[i][j];
                    posi = i + 1;
                    posj = j + 1;
                }
            }
        }

        System.out.println(
                "El numero mayor de la matriz es: " + nm + " Se encuentra en la posicion; " + posi + " " + posj);

    }

}
