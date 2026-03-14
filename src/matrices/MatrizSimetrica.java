package src.matrices;


import java.util.Random;

public class MatrizSimetrica {

    public static void main(String[] args) {

        int n = 4;
        int[][] matriz = new int[n][n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = r.nextInt(10);
            }
        }

        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        System.out.println("\n¿Es simétrica? " + simetrica);

        System.out.println("Esquinas:");
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][n - 1]);
        System.out.println(matriz[n - 1][0]);
        System.out.println(matriz[n - 1][n - 1]);
    }
}