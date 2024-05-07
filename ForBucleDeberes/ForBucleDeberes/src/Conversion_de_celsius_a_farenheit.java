public class Conversion_de_celsius_a_farenheit {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 100; celsius+=10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32; //(0 °C × 9/5) + 32 = 32 °F (Formula para pasar de farenheit a celsius)

            System.out.println(celsius + " °C\t " + fahrenheit + "°F");
        }
    }
}