package Estructura6AM;

import java.util.Scanner;

public class pn5 {
    
    public void punto5() {

        
    }


    public void FusionMatriz(ObjProducto[][] M1, ObjProducto[][] M2)
    {

        int fil = M1.length;
        int col = M2.length;
        Metodosnuevos m = new Metodosnuevos();
        Scanner sc = new Scanner(System.in);

        ObjProducto[][] MR = new ObjProducto[fil][col];

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {

                for (int i2 = 0; i2 < M2.length; i2++) {
                    for(int j2 = 0; j2 < M2.length; j2++){
                        if(M1[i][j].getNombre().equals(M2[i][j].getNombre()))
                        {
                            //MR[i2][j2] = ;
                        }
                    }
                }

               // if( M1[i][j].getNombre().equals(M2[i][j].getNombre()))
                //{
                  //  MR[i][j] = new ObjProducto(M1[i][j].getNombre(), M1[i][j].getPrecio(), (M1[i][j].getCantidad() + M2[i][j].getPrecio()));
               // }
                
            }
        }

        m.MostrarMatrizObjetual(MR);
    }


    public static void main(String[] args) {

        Metodosnuevos m = new Metodosnuevos();
        Scanner sc = new Scanner(System.in);

        //Matriz 1
        System.out.println("Ingrese el tamaño de la matriz 1: ");

        while (!sc.hasNextInt()) {
            System.out.println("Dato incorrecto, intentelo de nuevo: ");
            sc.next();
        }
        int d = sc.nextInt();

        ObjProducto[][] M1 = new ObjProducto[d][d];
        M1 = m.llenarmatrizObjetual(d);

        //Matriz 2

        System.out.println("Ingrese el tamaño de la matriz 2: ");

        while (!sc.hasNextInt()) {
            System.out.println("Dato incorrecto, intentelo de nuevo: ");
            sc.next();
        }
        int t = sc.nextInt();

        ObjProducto[][] M2 = new ObjProducto[t][t];
        M2 = m.llenarmatrizObjetual(t);


        System.out.println("Matriz 1");
        m.MostrarMatrizObjetual(M1);

        System.out.println("Matriz 2");
        m.MostrarMatrizObjetual(M2);

        System.out.println("Matriz resultante");
        
        new pn5().FusionMatriz(M1, M2);
    }

}
