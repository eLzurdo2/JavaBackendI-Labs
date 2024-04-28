import java.util.Scanner;

public class ComprobadorDePase {
    public static void main(String[] args) {
        System.out.println("Ingrese su calificación del 0 al 12 para evaluar si aprobó o desaprobó la materia:");
        Scanner sc = new Scanner(System.in);
        double calificacion = sc.nextDouble();

        if (calificacion > 12 ) {
            System.out.println("Numero incorrecto. Vuelva a digitar una calificacion del 0 al 12");
        } else if (calificacion < 0) {
            System.out.println("Numero incorrecto. Vuelva a digitar una calificacion del 0 al 12");
        } else if (calificacion  >= 5.5) {
            System.out.println("Aprobado");
        } else  {
            System.out.println("Desaprobado");
        }
    }
}
