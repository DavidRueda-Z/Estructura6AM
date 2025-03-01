package Estructura6AM;

import java.util.Scanner;

public class Menunuevo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        boolean continua = true;
        while (continua) {
            System.out.println("Ingrese el punto que desea validar: \n" +
                    "1. Mostrar la ubicacion fil/col de un producto \n" +
                    "2. Mostrar la suma total del inventario \n" +
                    "3. Salir");
            while (!sc.hasNextInt()) {
                System.out.println("Dato incorrecto, intentelo de nuevo: ");
                sc.next();
            }
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Este es el punto 1 ");
                    new pn1().punto1();
                    break;
                case 2:
                    System.out.println("Este es el punto 2:");

                case 3:
                    System.out.println("Adios");
                    continua = false;
                    break;

                default:
                    System.out.println("Dato incorrecto, digite una opcion: ");
                    break;
            }
        }

    }
}
