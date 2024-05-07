public class SumaPrimeros100NumerosNaturales {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("Suma de los primeros 100 numeros naturales:" + suma);
    }
}
