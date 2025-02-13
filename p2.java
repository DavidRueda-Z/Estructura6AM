package Estructura6AM;

public class p2 {
    
    public void nmmayor(int n){

    Metodos m = new Metodos();
    int [][] M = m.LlenarMatriz(n);
    int nm = m.NumeroMayor(M);

    System.out.println("El numero mayor de la matriz es: " + nm);
    m.MostrarMatriz(M);
    }

}
