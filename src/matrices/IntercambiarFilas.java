package src.matrices;


import java.util.Random;

public class IntercambiarFilas {

    public static void main(String[] args) {

        int m = 4;
        int n = 4;

        int[][] matriz = new int[m][n];
        Random r = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                matriz[i][j] = r.nextInt(50);
            }
        }

        System.out.println("Matriz original:");

        imprimir(matriz);

        // intercambiar fila 0 y 1
        int[] temp = matriz[2];
        matriz[2] = matriz[1];
        matriz[1] = temp;

        System.out.println("\nMatriz con filas intercambiadas:");

        imprimir(matriz);
    }

    public static void imprimir(int[][] matriz){

        for (int[] fila : matriz){
            for (int n : fila){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
