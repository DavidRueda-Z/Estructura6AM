import java.util.Scanner;

public class Validar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        System.out.println("Ingrese la opcion numerica: ");
        while (!sc.hasNextInt()) {
            System.out.println("Dato incorrecto, intentelo de nuevo: ");
            sc.next();
        }
        opt = sc.nextInt();
        System.out.println(opt);
    }
    
}
