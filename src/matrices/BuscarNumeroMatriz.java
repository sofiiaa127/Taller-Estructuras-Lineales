package src.matrices;

import java.util.Random;

public class BuscarNumeroMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        Random r = new Random();

        int numeroBuscar = 7;

        // llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(10);
            }
        }

        // imprimir matriz
        System.out.println("Matriz:");

        for (int[] fila : matriz) {
            for (int n : fila) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        // buscar número
        boolean encontrado = false;

        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numeroBuscar) {
                    System.out.println("\nNumero encontrado en posicion: [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("\nNumero no encontrado");
        }
    }
}
