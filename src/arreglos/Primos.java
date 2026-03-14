package src.arreglos;

public class Primos {

    public static void main(String[] args) {

        int[] primos = {2,3,5,7,11,13,17,19,23,29};

        imprimir(primos);
    }

    public static void imprimir(int[] arreglo){
        for(int n : arreglo){
            System.out.print(n + " ");
        }
    }
}