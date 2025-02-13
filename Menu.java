package Estructura6AM;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("Ingrese el punto que requiere visualizar de 1 hasta el 11: ");
        opc = sc.nextInt();
        Metodos m = new Metodos();

        switch (opc) {
            case 1:
                // p1 punto1 = new p1();
                // punto1.sumarmatriz(d);
                new p1().sumarmatriz(m.SolicitarDimension());
                break;

            case 2:
                // p2 punto2 = new p2();
                // punto2.nmmayor(d);
                new p2().nmmayor(m.SolicitarDimension());
                break;

            case 3:
                // p2 punto2 = new p2();
                // punto2.nmmayor(d);
                new p3(m.SolicitarDimension());
                break;

            default:
                System.out.println("Pagina en mantenimiento");
                break;
        }
    }

}
