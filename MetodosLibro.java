package Estructura6AM;

import java.util.Scanner;

public class MetodosLibro {

    Scanner sc = new Scanner(System.in);

    public ObjLibro[][] LlenarLibro(int d) {
        ObjLibro[][] m = new ObjLibro[d][d];

        System.out.println("LIBRERIA");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                // Creo metodo para capturar objeto
                ObjLibro obj = new ObjLibro();

                System.out.println("Ingrese el titulo del libro: ");
                obj.setTitulo(sc.next());

                System.out.println("Ingrese el nombre del autor: ");
                obj.setAutor(sc.next());

                System.out.println("Ingrese el precio del libro: ");
                while (!sc.hasNextLong()) {
                    System.out.println("DATO ERRONEO, INTENTELO DE NUEVO ");
                    sc.next();
                }
                obj.setPrecio(sc.nextLong());

                m[i][j] = obj;

                System.out.println("\n");
            }
        }
        return m;
    }

    public void MostrarLiberia(ObjLibro[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("Nombre: " + m[i][j].getTitulo());
                System.out.println("Autor: " + m[i][j].getAutor());
                System.out.println("Precio: " + m[i][j].getPrecio());
            }
            System.out.println("\n");
        }
    }

    public void BuscarMayor(ObjLibro[][] m) {
        // para guardar el valor del precio mas alto
        long mayor = 0;
        // para guardar la posicion en la que se encuentra el libro
        int fila = 0, columna = 0;
        // creo el objeto vacio donde voy a almacenar toda la informacion del libro con
        // mayor precio
        ObjLibro libromayor = null;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPrecio() > mayor) {
                    mayor = m[i][j].getPrecio();
                    libromayor = m[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }

        if (libromayor != null) {
            System.out.println("El libro mas caro es: ");
            System.out.println("Titulo: " + libromayor.getTitulo());
            System.out.println("Autor: " + libromayor.getAutor());
            System.out.println("Precio:  $" + libromayor.getPrecio());
            System.out.println("El libro esta ubicado en la fila " + (fila + 1) + " Y columna " + (columna + 1));
        } else {
            System.out.println("No hay libros");
        }

    }
}
