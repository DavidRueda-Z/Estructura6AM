package Estructura6AM;

import java.util.Scanner;

public class pn1 {

    public static void main(String[] args) {

        //Creo un objeto para que trabaje los metodos
        Metodosnuevos m = new Metodosnuevos();
        Scanner sc = new Scanner(System.in);
        int d = 0;
        System.out.println("Ingrese la dimension de la matriz a trabajar: ");
        d = sc.nextInt();
        ObjProducto [][] M = new ObjProducto[d][d];
        M = m.llenarmatrizObjetual(d);
        m.MostrarMatrizObjetual(M);
        m.BuscarProducto(M);
        
    }
    
}
