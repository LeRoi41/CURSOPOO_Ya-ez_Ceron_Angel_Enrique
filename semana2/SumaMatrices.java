import java.util.Scanner;

public class SumaMatrices {
    public static void main(String[] args) {
        boolean continuar = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (continuar) {
                int[][] matrizA = new int[3][3];
                int[][] matrizB = new int[3][3];
                int[][] matrizS = new int[3][3];
                
                System.out.println("Introduce los valores de la matriz A (3x3):");
                leerMatriz(matrizA, scanner);
                
                System.out.println("Introduce los valores de la matriz B (3x3):");
                leerMatriz(matrizB, scanner);
                
                // Sumar matrices
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                }
                
                System.out.println("Matriz A:");
                imprimirMatriz(matrizA);
                System.out.println("Matriz B:");
                imprimirMatriz(matrizB);
                System.out.println("Matriz S (Resultado):");
                imprimirMatriz(matrizS);
                
                System.out.println("\n¿Deseas realizar otra suma de matrices? (SI/NO): ");
                String respuesta = scanner.next().trim().toLowerCase();
                if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("Programa finalizado. ¡Hasta luego!");
                }
            }
        }
    }

    public static void leerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Introduce un número entero:");
                    scanner.next();
                }
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
