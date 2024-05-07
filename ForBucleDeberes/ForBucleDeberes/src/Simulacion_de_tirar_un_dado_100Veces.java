import java.util.Random;

public class Simulacion_de_tirar_un_dado_100Veces {
    public static void main(String[] args) {
        int [] contadorDados = new int[6];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int resultadoLanzamiento = rand.nextInt(6) + 1;
            contadorDados[resultadoLanzamiento -1]++;
        }
        for (int i = 0; i < contadorDados.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + contadorDados[i] + " veces");
        }
    }
}
