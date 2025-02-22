package Estructura6AM;

import java.util.Scanner;

public class Metodosnuevos {

    Scanner sc = new Scanner(System.in);

    public ObjProducto[][] llenarmatrizObjetual(int d) {

        ObjProducto[][] m = new ObjProducto[d][d];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                ObjProducto obj = new ObjProducto(); // Creo un objeto para que capture todas las variables juntas
                // para luego mandar todas las variables al objeto, ya que la posicion m[i][j]
                // es un objeto y no un campo individual

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next());

                System.out.println("Ingrese el precio");
                while (!sc.hasNextLong()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                obj.setPrecio(sc.nextLong());

                System.out.println("Ingrese la cantidad: ");
                while (!sc.hasNext()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                obj.setCantidad(sc.nextLong());

                m[i][j] = obj;
            }
        }
        return m;

    }

    public void MostrarMatrizObjetual(ObjProducto[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                // El metodo get lo que hace es consultarle a la matriz que ya esta llena
                // para que me muestre lo que hay en ese objeto

                System.out.println("Nombre: " + m[i][j].getNombre().toUpperCase());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
                System.out.println("\n");
            }
        }
    }

    public String BuscarProducto(ObjProducto[][] m) {

        System.out.println("Ingrese el producto a buscar: ");
        String mensaje = sc.next().toUpperCase();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getNombre().toUpperCase().equals(mensaje)) {
                    return "El producto se encuentra en la fila " + (i + 1) + " columna " + (j + 1);
                }
            }
        }
        return "Producto no encontrado";
    }

    public int SumarInventario(ObjProducto[][] m) {
        int suma = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                suma += m[i][j].getCantidad();
            }
        }

        return suma;
    }
    

}
