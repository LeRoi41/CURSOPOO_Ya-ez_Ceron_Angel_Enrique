import java.util.Scanner;

public class promedioPositivoNegativo {
    public static void main(String[] args) {
        boolean continuar = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (continuar) {
                int[] numeros = new int[10];
                int sumaPositivos = 0, sumaNegativos = 0, countPositivos = 0, countNegativos = 0;
                
                System.out.println("Introduce 10 números enteros: ");
                for (int i = 0; i < 10; i++) {
                    while (!scanner.hasNextInt()) {
                        System.out.println("Introduce un número entero: ");
                        scanner.next();
                    }
                    numeros[i] = scanner.nextInt();
                    if (numeros[i] > 0) {
                        sumaPositivos += numeros[i];
                        countPositivos++;
                    } else if (numeros[i] < 0) {
                        sumaNegativos += numeros[i];
                        countNegativos++;
                    }
                }
                
                System.out.println("Promedio de números positivos: " +
                        (countPositivos > 0 ? (double) sumaPositivos / countPositivos : "N/A"));
                System.out.println("Promedio de números negativos: " +
                        (countNegativos > 0 ? (double) sumaNegativos / countNegativos : "N/A"));
                
                System.out.println("\n¿Deseas realizar otro cálculo? (SI/NO): ");
                String respuesta = scanner.next().trim().toLowerCase();
            if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("Programa finalizado. ¡Hasta luego!");
                }
            }
        }
    }
}
