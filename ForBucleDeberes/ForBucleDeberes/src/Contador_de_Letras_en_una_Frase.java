import java.util.Scanner;

public class Contador_de_Letras_en_una_Frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = sc.nextLine();

        System.out.println("Ingrese una letra de la cadena para comenzar el conteo:");
        char letra = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;

            }

        }
        if (contador == 0) {
            System.out.println("La letra " + letra + " aparece: " + contador + " veces en su cadena");
        } else if (contador == 1) {
            System.out.println("La letra " + letra + " aparece: " + contador + " vez en su cadena");
        } else {
            System.out.println("La letra " + letra + " aparece: " + contador + " veces en su cadena");
        }


    }
}
