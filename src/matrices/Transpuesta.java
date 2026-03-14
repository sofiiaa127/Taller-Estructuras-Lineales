package src.matrices;

public class Transpuesta {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };

        int[][] transpuesta = new int[3][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");

        for (int[] fila : matriz) {
            for (int n : fila)
                System.out.print(n + " ");
            System.out.println();
        }

        System.out.println("\nMatriz transpuesta:");

        for (int[] fila : transpuesta) {
            for (int n : fila)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}