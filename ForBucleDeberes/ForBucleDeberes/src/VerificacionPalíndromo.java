import java.util.Scanner;

public class VerificacionPalíndromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = scanner.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();


        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra o frase es un palíndromo valido");
        } else {
            System.out.println("La palabra o frase es un palíndromo invalida");
        }
        scanner.close();
    }
}
