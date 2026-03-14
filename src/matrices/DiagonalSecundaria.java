package src.matrices;


import java.util.Random;

public class DiagonalSecundaria {

    public static void main(String[] args) {

        int n = 5;
        int[][] matriz = new int[n][n];
        Random r = new Random();

        int suma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matriz[i][j] = r.nextInt(101) - 50;

                if (i + j == n - 1) {
                    suma += matriz[i][j];
                }
            }
        }

        for (int[] fila : matriz) {
            for (int n1 : fila) {
                System.out.print(n1 + " ");
            }
            System.out.println();
        }

        System.out.println("\nSuma diagonal secundaria: " + suma);
    }
}