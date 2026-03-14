package src.arreglos;

public class Pares {

    public static void main(String[] args) {

        int[] pares = new int[100];

        // generar los 100 números pares
        for (int i = 0; i < 100; i++) {
            pares[i] = (i + 1) * 2;
        }

        // imprimir en una sola línea
        System.out.println("En una sola linea:");
        for (int n : pares) {
            System.out.print(n + " ");
        }

        System.out.println("\n");

        // imprimir en 10 líneas
        System.out.println("En 10 lineas:");
        for (int i = 0; i < pares.length; i++) {

            System.out.print(pares[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}