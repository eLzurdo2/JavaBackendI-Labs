public class SumaTodosElementosArreglo {
    public static void main(String[] args) {

        int[] Arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;

        for (int i = 0; i < Arreglo.length; i++) {
            suma += Arreglo[i];

        }
        System.out.println("La suma de los elementos del arreglo es:" + suma);
    }
}
