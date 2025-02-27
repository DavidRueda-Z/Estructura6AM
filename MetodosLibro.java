package Estructura6AM;

import java.util.Scanner;

public class MetodosLibro {

    Scanner sc = new Scanner(System.in);
    
    public ObjLibro[][] LlenarLibro(int d)
    {
        ObjLibro [][] m = new ObjLibro[d][d];

        System.out.println("LIBRERIA");
        ;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                
                
                //Creo metodo para capturar objeto
                ObjLibro obj = new ObjLibro();

                System.out.println("Ingrese el titulo del libro: ");
                obj.setTitulo(sc.next());

                System.out.println("Ingrese el nombre del autor: ");
                obj.setAutor(sc.next());

                System.out.println("Ingrese el precio del libro: ");
                while(!sc.hasNextLong())
                {
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

    public void MostrarLiberia(ObjLibro[][] m)
    {   
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                System.out.println("Nombre: " + m[i][j].getTitulo());
                System.out.println("Autor: " + m[i][j].getAutor());
                System.out.println("Precio: " + m[i][j].getPrecio());
            }
            System.out.println("\n");
        }
    }

    public void BuscarMayor(ObjLibro[][] m)
    {
        long mayor = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j].getPrecio() > mayor)
                {
                    mayor = m[i][j].getPrecio();
                }
            }
        }
    }
}
