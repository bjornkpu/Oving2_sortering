package Oving3_sortering;

import java.util.Arrays;

public class Main {

    private final static int ANTALL = 200;
    private final static int MAX = 20;
    private final static int DV = 10;

    public static void main(String[] args) {
        int[] numbers = new int[ANTALL];

        java.util.Random r = new java.util.Random();
        for(int i = 0; i < numbers.length; i++){
//            numbers[i] = r.nextInt(MAX);
            numbers[i]=-i;
        }

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        numbers = Algoritme.sort(numbers,DV);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\n");

        int[] finalNumbers = numbers;
        System.out.println(Tidtaker.getTid(()-> Algoritme.sort(finalNumbers,DV)));


    }

}
