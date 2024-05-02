import java.util.Scanner;

public class CalculadoraDeRangoDeEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su edad para poder verificar en que rango se ecuentra (Bebe, Niño, Adolecente, Adulto, Anciano: ");
        int edad = sc.nextInt();

        if (edad <= 0)  {
            System.out.println("Edad incorrecta, no se pudo clasificar su edad ingresada. Vuelva a digitar una edad valida");
        } else if (edad <= 3) {
            System.out.println("Usted se ecuentra en la categoria de Bebe");

        } else if (edad <= 12) {
            System.out.println("Usted es un Niño");
        } else if (edad <= 17) {
            System.out.println("Usted es un Adolecente");
        } else if (edad <= 60) {
            System.out.println("Usted es un Adulto");

        } else {
            System.out.println("Usted es un Anciano");

        }
        sc.close();
    }
}
