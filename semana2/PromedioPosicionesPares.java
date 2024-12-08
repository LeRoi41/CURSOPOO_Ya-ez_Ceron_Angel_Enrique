import java.util.Scanner;

public class PromedioPosicionesPares {
    public static void main(String[] args) {
        boolean continuar = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (continuar) {
                int[] numeros = new int[10];
                int suma = 0, count = 0;
                
                System.out.println("Introduce 10 números enteros:");
                for (int i = 0; i < 10; i++) {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Introduce un número entero:");
                        scanner.next();
                    }
                    numeros[i] = scanner.nextInt();
                    if (i % 2 == 0) { // Posiciones pares
                        suma += numeros[i];
                        count++;
                    }
                }
                
                System.out.println("Promedio de números en posiciones pares: " +
                        (count > 0 ? (double) suma / count : "N/A"));
                
                System.out.println("\n¿Deseas realizar otro cálculo? (SI/NO): ");
                String respuesta = scanner.next().trim().toLowerCase();
                if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("Programa finalizado. Hasta luego!");
                }
            }
        }
    }
}
