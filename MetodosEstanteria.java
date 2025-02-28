package Estructura6AM;

import java.util.Scanner;

public class MetodosEstanteria {

    Scanner sc = new Scanner(System.in);

    public ObjEstanteria[][] LlenarEstanteria(int d) {
        ObjEstanteria[][] m = new ObjEstanteria[d][d];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                // Creo el objeto para guardar los datos
                ObjEstanteria obj = new ObjEstanteria();

                System.out.println("Ingrese el nombre del producto: ");
                obj.setNombre(sc.next());

                System.out.println("Ingrese el precio: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Dato erroneo, intentelo de nuevo: ");
                    sc.next();
                }
                obj.setPrecio(sc.nextDouble());

                System.out.println("El producto está disponible? (SI / NO): ");
                String dis = sc.next().toUpperCase();
                while (!dis.equals("SI") && !dis.equals("NO")) {
                    System.out.println("Entrada invalida, intentelo de nuevo");
                    dis = sc.next().toUpperCase();
                }
                obj.setDisponible(dis.equals("SI"));

                System.out.println(" ");
                m[i][j] = obj;
            }

        }

        return m;
    }

    public void MostrarEstanteria(ObjEstanteria[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.println("Producto: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Disponible: " + m[i][j].isDisponible());
                System.out.println("------------------------");
            }
        }
    }

    public ObjEstanteria[][] EstanteriaDisp(ObjEstanteria[][] m) {
        // Contador para saber que productos hay disponibles
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].isDisponible()) {
                    cont++;
                }
            }
        }

        // Creo nueva matriz del tamaño necesitado
        int fil = m.length;
        int col = m[0].length;
        ObjEstanteria[][] disponible = new ObjEstanteria[cont][1];

        // Copiar solo los productos disponibles
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].isDisponible()) {
                    disponible[index][0] = m[i][j];
                    index++;
                }
            }
        }
        return disponible;
    }

}
