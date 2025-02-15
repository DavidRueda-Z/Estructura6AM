package Estructura6AM;

import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public int SolicitarDimension() {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        System.out.println("ingrese la dimension de la matriz");
        d = sc.nextInt();
        return d;
    }

    public int[][] LlenarMatriz(int d) {
        int[][] m = new int[d][d];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 500 + 1);
            }
        }
        return m;
    }

    //Este metodo lo que hace es llenar una matriz de objetos, es decir una matriz que por cada posicion puede tener 
    public ObjPersona[][] llenarmatrizObjetual(int d) {

        ObjPersona[][] m = new ObjPersona[d][d];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                ObjPersona obj = new ObjPersona(); // Creo un objeto para que capture todas las variables juntas
                //para luego mandar todas las variables al objeto, ya que la posicion m[i][j] es un objeto y no un campo individual

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el apellido: ");
                obj.setApellido(sc.next());
                System.out.println("Ingrese la direccion: ");
                obj.setDireccion(sc.next());
                System.out.println("Ingrese el telefono: ");
                obj.setTelefono(sc.nextLong());

                m[i][j] = obj;
            }
        }
        return m;

    }

    public void MostrarMatrizObjetual(ObjPersona[][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                //El metodo get lo que hace es consultarle a la matriz que ya esta llena
                //para que me muestre lo que hay en ese objeto

                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Apellido: " + m[i][j].getApellido());
                System.out.println("Direccion: " + m[i][j].getDireccion());
                System.out.println("Telefono: " + m[i][j].getTelefono());
                System.out.println("\n");
            }
        }
    }


    public ObjPersona[][] llenarmatrizObjCll(int d){

        ObjPersona[][] m = new ObjPersona[d][d];
        
        String nombre;
        String apellido;
        String direccion;
        long telefono;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el nombre: ");
                nombre = sc.next();
                System.out.println("Ingrese el apellido: ");
                apellido = sc.next();
                System.out.println("Ingrese la direccion: ");
                direccion = sc.next();
                System.out.println("Ingrese el telefono: ");
                telefono = sc.nextLong();

                ObjPersona o = new ObjPersona(nombre, apellido, direccion, telefono);
                m[i][j] = o;
            }
        }

        return m;

    }

    public void MostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" | " + m[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public int SumarMatriz(int[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma += m[i][j];
            }
        }
        return suma;
    }

    public int NumeroMayor(int[][] m) {

        int mayor = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] > mayor) {
                    mayor = m[i][j];

                }
            }
        }
        return mayor;
    }
}
