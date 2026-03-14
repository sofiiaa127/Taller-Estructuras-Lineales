package src.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Frecuencia {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            lista.add(r.nextInt(20) + 1);
        }

        System.out.println("Lista generada:");
        System.out.println(lista);

        int[] frecuencia = new int[21];

        // contar frecuencia
        for (int num : lista) {
            frecuencia[num]++;
        }

        System.out.println("\nNumero - Frecuencia");

        int maxFrecuencia = 0;
        int numeroMasRepetido = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " -> " + frecuencia[i]);

            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
                numeroMasRepetido = i;
            }
        }

        System.out.println("\nNumero que mas se repite: " + numeroMasRepetido);
    }
}