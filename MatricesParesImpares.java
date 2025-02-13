package Estructura6AM;
import java.util.Scanner;
public class MatricesParesImpares{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Metodos m = new Metodos();
        int d = m.SolicitarDimension();
        int [][] matriz = m.LlenarMatriz(d);
        m.LlenarMatriz(d);
        m.MostrarMatriz(matriz);
        System.out.println("Suma de matriz: " + m.SumarMatriz(matriz));
    }
}
