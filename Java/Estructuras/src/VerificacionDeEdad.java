import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

          if (edad >= 18) {
            System.out.println("Eres  mayor de edad");
        } else if (edad <= 0) {
            System.out.println("Error, numero de edad incorrecto.");
        } else {
            System.out.println("Eres menor de edad");
        }
        sc.close();

    }
}

