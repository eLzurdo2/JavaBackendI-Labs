import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la hora de forma (24 horas): ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Buenas tardes");
        } else  {
            System.out.println("Buenas noches");
        }
        sc.close();
    }

}
