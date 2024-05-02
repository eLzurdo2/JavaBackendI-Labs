import java.util.Scanner;

public class SimuladorInversiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el estado actual del mercado (recesión, estable, crecimiento):");
        String estadoMercado = sc.nextLine();

        System.out.println("Ingrese el perfil de riesgo (bajo, medio, alto):");
        String perfilDeRiesgo = sc.nextLine();

        if ("recesion".equalsIgnoreCase(estadoMercado) && "bajo".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Bonos");
        } else if ("recesion".equalsIgnoreCase(estadoMercado) && "medio".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Bienes raíces");
        } else if ("recesion".equalsIgnoreCase(estadoMercado) && "alto".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Acciones de empresas sólidas");

        } else if ("estable".equalsIgnoreCase(estadoMercado) && "bajo".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Cuentas de ahorro");
        } else if ("estable".equalsIgnoreCase(estadoMercado) && "medio".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Bienes raíces");
        } else if ("estable".equalsIgnoreCase(estadoMercado) && "alto".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Acciones de empresas con potencial de crecimiento");

        } else if ("crecimiento".equalsIgnoreCase(estadoMercado) && "bajo".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Bonos gubernamentales");
        } else if ("crecimiento".equalsIgnoreCase(estadoMercado) && "medio".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Acciones diversificadas");
        } else if ("crecimiento".equalsIgnoreCase(estadoMercado) && "alto".equalsIgnoreCase(perfilDeRiesgo )) {
            System.out.println("Inversión recomendada: Acciones de empresas de tecnología");
        } else {
            System.out.println("Estado del mercado o perfil de riesgo no válido. Por favor, vuelva a ingresar el estado del mercado y perfil de riesgo utilizando las opciones anteriormente dadas.");
        }
        sc.close();
    }
}