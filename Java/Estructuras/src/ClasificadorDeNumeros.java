import java.util.Scanner;

public class ClasificadorDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digitar un numero:");
        int numero = sc.nextInt();


        if (numero == 0) {
            System.out.println("Su numero es igual a 0");
        } else if (numero > 0) {
            System.out.println("Su numero es positivo");
        } else {
            System.out.println("Su numero es negativo");
        }
    }
}
