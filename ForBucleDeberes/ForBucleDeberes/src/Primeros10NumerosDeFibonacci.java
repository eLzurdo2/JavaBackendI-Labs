public class Primeros10NumerosDeFibonacci {
    public static void main(String[] args) {
        // Definimos los dos primeros números de la secuencia de Fibonacci
        int num1 = 0;
        int num2 = 1;

        System.out.println("Generar y Mostrar los Primeros 10 Números de la Secuencia de Fibonacci:");
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < 10; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
