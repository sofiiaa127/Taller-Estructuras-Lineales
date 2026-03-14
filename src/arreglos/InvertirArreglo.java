package src.arreglos;

import java.util.Random;

public class InvertirArreglo {

    public static void main(String[] args) {

        int[] original = generar();

        int[] invertido = invertir(original);

        System.out.println("Original:");

        imprimir(original);

        System.out.println("\nInvertido:");

        imprimir(invertido);
    }

    public static int[] generar(){

        Random r = new Random();

        int[] arr = new int[20];

        for(int i=0;i<20;i++){

            arr[i] = r.nextInt(100);
        }

        return arr;
    }

    public static int[] invertir(int[] arr){

        int[] inv = new int[arr.length];

        int j = arr.length - 1;

        for(int i=0;i<arr.length;i++){

            inv[i] = arr[j];

            j--;
        }

        return inv;
    }

    public static void imprimir(int[] arr){

        for(int n : arr){

            System.out.print(n + " ");
        }
    }
}
