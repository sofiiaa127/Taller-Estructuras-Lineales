package src.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        Random r = new Random();

        int numero;

        int suma = 0;

        do{

            numero = r.nextInt(21) - 10;

            lista.add(numero);

            suma += numero;

        }while(numero != 10);

        System.out.println(lista);

        System.out.println("Suma: " + suma);

        System.out.println("Media: " + (double)suma/lista.size());
    }
}