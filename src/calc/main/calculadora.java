package calc.main;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\nMenú Principal:");
                System.out.println("1.- Operaciones Matemáticas.");
                System.out.println("2.- Convertir Unidades.");
                System.out.println("3.- Salir.");
                System.out.print("\nIngrese una opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> realizarOperacionesMatematicas(scanner);
                    case 2 -> convertirUnidades(scanner);
                    case 3 -> System.out.println("Hasta luego!");
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 3);
        }
    }

    public static void realizarOperacionesMatematicas(Scanner scanner) {
        int numero1, numero2, opcion;

        do {
            System.out.println("\nIngrese Número 1: ");
            numero1 = scanner.nextInt();

            System.out.println("Ingrese Número 2: ");
            numero2 = scanner.nextInt();

            do {
                System.out.println("\nOperaciones Matemáticas:");
                System.out.println("1.- Sumar.");
                System.out.println("2.- Restar.");
                System.out.println("3.- Multiplicar.");
                System.out.println("4.- Dividir.");
                System.out.println("5.- División con residuo.");
                System.out.println("6.- Regresar al Menú Principal.");
                System.out.print("\nIngrese una opción: ");
                opcion = scanner.nextInt();
            } while (opcion < 1 || opcion > 6);

            switch (opcion) {
                case 1 -> System.out.println("Resultado: " + (numero1 + numero2));
                case 2 -> System.out.println("Resultado: " + (numero1 - numero2));
                case 3 -> System.out.println("Resultado: " + (numero1 * numero2));
                case 4 -> {
                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (numero1 / numero2));
                    }
                }
                case 5 -> {
                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (numero1 % numero2));
                    }
                }
                case 6 -> System.out.println("Regresando al Menú Principal...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    public static void convertirUnidades(Scanner scanner) {
        int opcion;

        do {
            System.out.println("\nMenú de Conversión de Unidades:");
            System.out.println("1.- Metros a Centímetros y Pulgadas.");
            System.out.println("2.- Kilogramos a Libras y Gramos.");
            System.out.println("3.- Metros/segundo a Kilómetros/hora.");
            System.out.println("4.- Regresar al Menú Principal.");
            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> convertirLongitud(scanner);
                case 2 -> convertirMasa(scanner);
                case 3 -> convertirVelocidad(scanner);
                case 4 -> System.out.println("Regresando al Menú Principal...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void convertirLongitud(Scanner scanner) {
        System.out.print("\nIngrese la longitud en metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double pulgadas = metros * 39.3701;

        System.out.println("Equivale en centímetros: " + centimetros + " cm");
        System.out.println("Equivale en pulgadas: " + pulgadas + " in");
    }

    public static void convertirMasa(Scanner scanner) {
        System.out.print("\nIngrese kilogramos: ");
        double kilogramos = scanner.nextDouble();

        double gramos = kilogramos * 1000;
        double libras = kilogramos * 2.20462;

        System.out.println("Equivale en gramos a: " + gramos + " g");
        System.out.println("Equivale en libras a: " + libras + " lb");
    }

    public static void convertirVelocidad(Scanner scanner) {
        System.out.print("\nIngrese la velocidad en metros/segundo: ");
        double metrosPorSegundo = scanner.nextDouble();

        double kilometrosPorHora = metrosPorSegundo * 3.6;

        System.out.println("Equivale en kilómetros/hora: " + kilometrosPorHora + " km/h");
    }
}
