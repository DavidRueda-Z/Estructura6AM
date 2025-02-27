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
            for (int j = 0; j < m[0].length; j++) {

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

    public ObjProducto[][] LlenarMatrizNC(int f, int c) {

        ObjProducto[][] m = new ObjProducto[f][c];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                ObjProducto obj = new ObjProducto();

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next());

                System.out.println("Ingrese el precio: ");
                while (!sc.hasNextLong()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                obj.setPrecio(sc.nextLong());

                System.out.println("Ingrese el stock: ");
                while (!sc.hasNextLong()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                obj.setCantidad(sc.nextLong());

                m[i][j] = obj;
            }
        }
        return m;
    }

    public ObjProducto[][] SumarMatricesObj(ObjProducto[][] m1, ObjProducto[][] m2) {

        // La funcion Math.max escoge el numero maximo entre los que se le envien, en
        // este caso
        // m1.length y m2.length

        int filas = Math.max(m1.length, m2.length);
        int columnas = Math.max(m1[0].length, m2[0].length);

        // Crear una nueva matriz con el tamaño del maximo de cada matriz
        ObjProducto[][] resultado = new ObjProducto[filas][columnas];

        // Copio una de las matrices en la resultante
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = new ObjProducto(m1[i][j].getNombre(), m1[i][j].getPrecio(), m1[i][j].getCantidad());
            }

        }

        // Comparo nombres y comienzo a llenar
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                ObjProducto productoM2 = m2[i][j];
                boolean encontrado = false;

                // En caso de que encuentre el mismo nombre hacemos esto
                for (int i2 = 0; i2 < resultado.length; i2++) {
                    for (int j2 = 0; j2 < resultado[i2].length; j2++) {
                        if (resultado[i2][j2] != null && resultado[i2][j2].getNombre() != null
                                && resultado[i2][j2].getNombre().equalsIgnoreCase(productoM2.getNombre())) {
                            resultado[i2][j2].setCantidad(resultado[i2][j2].getCantidad() + productoM2.getCantidad());
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado)
                        break;
                }

                // Si no encuentra, lo agregamos en posicion vacía

                if (!encontrado) {
                    for (int i2 = 0; i2 < resultado.length; i2++) {
                        for (int j2 = 0; j2 < resultado[i2].length; j2++) {
                            if (resultado[i2][j2] == null) {
                                resultado[i2][j2] = new ObjProducto(productoM2.getNombre(), productoM2.getPrecio(),
                                        productoM2.getCantidad());
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado)
                            break;
                    }
                }

            }

        }
        return resultado;

    }
}
