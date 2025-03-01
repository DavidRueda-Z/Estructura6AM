package Estructura6AM;

import java.util.Scanner;

public class MetodosEstanteria2 {

    Scanner sc = new Scanner(System.in);

    public ObjProducto2[][] LlenarEstanteria(int d) {
        // Creo la matriz de estantería
        ObjProducto2[][] estanteria = new ObjProducto2[d][d];

        // Llenado de la matriz con productos
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; j++) {

                // Creación del objeto Producto
                ObjProducto2 producto = new ObjProducto2();

                System.out.println("Ingrese el nombre del producto: ");
                producto.setNombre(sc.next());

                System.out.println("Ingrese el peso del producto: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Dato incorrecto, ingrese un número válido: ");
                    sc.next();
                }
                producto.setPeso(sc.nextDouble());

                System.out.println("Ingrese la categoría del producto (A, B, C, D, E): ");
                String categoria = sc.next().toUpperCase();
                while (!categoria.matches("[ABCDE]")) {
                    System.out.println("Categoría inválida. Ingrese A, B, C, D o E: ");
                    categoria = sc.next().toUpperCase();
                }
                producto.setCategoria(categoria);

                estanteria[i][j] = producto;
            }
        }
        return estanteria;
    }

    public void MostrarEstanteria(ObjProducto2[][] estanteria) {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; j++) {
                System.out.println("Producto: " + estanteria[i][j].getNombre());
                System.out.println("Peso: " + estanteria[i][j].getPeso());
                System.out.println("Categoría: " + estanteria[i][j].getCategoria());
                System.out.println("------------------------");
            }
        }
    }

    public void FiltrarYMostrarProductos(ObjProducto2[][] estanteria) {
        String[] categorias = { "A", "B", "C", "D", "E" };

        for (String categoria : categorias) {
            int contador = 0;
            for (int i = 0; i < estanteria.length; i++) {
                for (int j = 0; j < estanteria[i].length; j++) {
                    if (estanteria[i][j].getCategoria().equals(categoria)) {
                        contador++;
                    }
                }
            }

            ObjProducto2[][] filtro = new ObjProducto2[contador][1];
            int index = 0;

            for (int i = 0; i < estanteria.length; i++) {
                for (int j = 0; j < estanteria[i].length; j++) {
                    if (estanteria[i][j].getCategoria().equals(categoria)) {
                        filtro[index][0] = estanteria[i][j];
                        index++;
                    }
                }
            }

            if (contador > 0) {
                System.out.println("\nProductos en la categoría " + categoria + ":");
                for (int i = 0; i < filtro.length; i++) {
                    System.out.println("Nombre: " + filtro[i][0].getNombre());
                    System.out.println("Peso: " + filtro[i][0].getPeso());
                    System.out.println("Categoría: " + filtro[i][0].getCategoria());
                    System.out.println("------------------------");
                }
            }
        }
    }
}
