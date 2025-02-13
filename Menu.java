package Estructura6AM;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("Ingrese el punto que requiere visualizar de 1 hasta el 11: ");
        opc = sc.nextInt();
        Metodos m = new Metodos();
        int d = m.SolicitarDimension();

        switch (opc) {
            case 1:
                p1 punto1 = new p1();
                punto1.sumarmatriz(d);
                break;

            case 2:
                p2 punto2 = new p2();
                punto2.nmmayor(d);
                break;

            default:
            System.out.println("Pagina en mantenimiento");
                break;
        }
    }
    
}
