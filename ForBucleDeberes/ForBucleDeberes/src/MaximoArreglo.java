public class MaximoArreglo {
    public static void main(String[] args) {

        int[] arreglo = {5, 3, 15, 16, 19, 21, 6, 7, 55, 22, 44, 54};
        int max = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        System.out.println("El maximo valor del arreglo es: " + max);
    }
}
