package Estructura6AM;

import java.util.Scanner;

public class MetodosTeatro {

    Scanner sc = new Scanner(System.in);

    public ObjPuesto[][] LlenarMatrizCuadrada(int tam) {
        ObjPuesto[][] m = new ObjPuesto[tam][tam];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                // Crear objeto que me capture las variables y luego llene la matriz
                ObjPuesto obj = new ObjPuesto();

                System.out.println("Ingrese el numero del asiento: ");
                while (!sc.hasNextInt()) {
                    System.out.println("DATO INCORRECTO, INTENTE DE NUEVO: ");
                    sc.next();
                }
                obj.setNumero(sc.nextInt());

                System.out.println("Ingese la letra de la Fila: ");
                obj.setFila(sc.next());

                System.out.println("Ingrese el precio del asiento: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("DATO INCORRECTO, INTENTE DE NUEVO: ");
                    sc.next();
                }
                obj.setPrecio(sc.nextDouble());

                // envio objeto a la matriz en posicion i,j
                m[i][j] = obj;
            }

        }
        return m;
    }

    public void MostrarMatriz(ObjPuesto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("Puesto: " + m[i][j].getFila().toUpperCase() + m[i][j].getNumero());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("\n");
            }
        }
    }

}
