package src.arreglos;

import java.util.Random;

public class Factoriales {

    public static void main(String[] args) {

        int n = 5;

        int[] numeros = generarNumeros(n);

        int[] factoriales = calcularFactoriales(numeros);

        imprimir(numeros);

        System.out.println();

        imprimir(factoriales);
    }

    public static int[] generarNumeros(int n){

        Random r = new Random();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = r.nextInt(10) + 1;
        }

        return arr;
    }

    public static int factorial(int num){

        int resultado = 1;

        for(int i=1;i<=num;i++){

            resultado *= i;
        }

        return resultado;
    }

    public static int[] calcularFactoriales(int[] arr){

        int[] fact = new int[arr.length];

        for(int i=0;i<arr.length;i++){

            fact[i] = factorial(arr[i]);
        }

        return fact;
    }

    public static void imprimir(int[] arr){

        for(int n : arr){

            System.out.print(n + " ");
        }
    }
}