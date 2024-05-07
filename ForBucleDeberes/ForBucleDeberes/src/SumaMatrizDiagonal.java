public class SumaMatrizDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, -2,  1},
                {7, 0,   6},
                {8, -1, 12}};
        int sumaDiagonalMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalMatriz += matriz[i][i];
        }

        System.out.println("La suma de los elementos en diagonal de la matriz cuadrada es: " + sumaDiagonalMatriz);
    }
}


