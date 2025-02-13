package Estructura6AM;

import java.util.Scanner;

public class Metodos {
    
    public int SolicitarDimension(){
        Scanner sc = new Scanner(System.in);
        int d = 0;
        System.out.println("ingrese la dimension de la matriz");
        d = sc.nextInt();
        return d;
    }
    
    public int[][] LlenarMatriz(int d)
    {
        int [][] m = new int[d][d];

        for(int i=0; i < m.length; i++){
            for(int j=0;j<m.length;j++){
                m[i][j] = (int) (Math.random()* 500 + 1);
            }
        }
        return m;
    }

    public void MostrarMatriz( int [][] m)
    {
        for(int i=0; i < m.length; i++){
            for(int j=0;j<m.length;j++){
                System.out.print(" - " + m[i][j]);
            }
            System.out.println();
        }
    }

    public int SumarMatriz(int[][] m)
    {
        int suma = 0;
        for(int i=0; i < m.length; i++){
            for(int j=0;j<m.length;j++){
                suma += m[i][j];
            }
        }  
        return suma;
    }

    public int NumeroMayor(int[][] m){

        int mayor = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] > mayor){
                    mayor = m[i][j];
                }
            }
        }
        return mayor;
    }
}
