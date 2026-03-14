package src.arreglos;

import java.util.Random;

public class MinMax {

    public static void main(String[] args) {

        int[] arr = generar();

        imprimir(arr);

        System.out.println();

        System.out.println("Menor: " + menor(arr));

        System.out.println("Mayor: " + mayor(arr));
    }

    public static int[] generar(){

        Random r = new Random();

        int[] arr = new int[25];

        for(int i=0;i<25;i++){

            arr[i] = r.nextInt(101) - 50;
        }

        return arr;
    }

    public static int menor(int[] arr){

        int min = arr[0];

        for(int n : arr){

            if(n < min){
                min = n;
            }
        }

        return min;
    }

    public static int mayor(int[] arr){

        int max = arr[0];

        for(int n : arr){

            if(n > max){
                max = n;
            }
        }

        return max;
    }

    public static void imprimir(int[] arr){

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
