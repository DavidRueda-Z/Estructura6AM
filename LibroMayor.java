package Estructura6AM;

import java.util.Scanner;

public class LibroMayor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        MetodosLibro m = new MetodosLibro();

        System.out.println("Ingrese el tamaño de la libreria que desea llenar, teniendo en cuenta que es matriz: ");
        int d = sc.nextInt();
        ObjLibro[][] M = new ObjLibro[d][d];
        M = m.LlenarLibro(d);
        m.MostrarLiberia(M);
    }
}
