package src.arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrdenarYSeparar {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();

        // generar 20 números entre 1 y 100
        for (int i = 0; i < 20; i++) {
            lista.add(r.nextInt(100) + 1);
        }

        System.out.println("Lista original:");
        System.out.println(lista);

        
        Collections.sort(lista);
        System.out.println("\nMenor a mayor:");
        System.out.println(lista);

        
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("\nMayor a menor:");
        System.out.println(lista);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int n : lista) {
            if (n % 2 == 0)
                pares.add(n);
            else
                impares.add(n);
        }

        System.out.println("\nPares:");
        System.out.println(pares);

        System.out.println("\nImpares:");
        System.out.println(impares);
    }
}
