package src.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i=2;i<=40;i+=2){

            lista.add(i);
        }

        System.out.println(lista);

        System.out.print("Ingrese número para insertar: ");

        int num = sc.nextInt();

        int pos = 0;

        while(pos < lista.size() && lista.get(pos) < num){

            pos++;
        }

        lista.add(pos,num);

        System.out.println(lista);

        System.out.print("Número a borrar: ");

        int borrar = sc.nextInt();

        lista.remove(Integer.valueOf(borrar));

        System.out.println(lista);

        sc.close();

    }
}
