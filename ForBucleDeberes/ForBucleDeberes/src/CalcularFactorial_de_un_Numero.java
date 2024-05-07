import java.util.Scanner;

public class CalcularFactorial_de_un_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero para determinar su factorial:");
        int num = sc.nextInt();

        long numFactorial = 1;
        for (int i = 1; i <= num; i++) {
            numFactorial *= i;

        }
        System.out.println("Se determino que el factorial del numero " + num + " es: " + numFactorial);
    }
}
