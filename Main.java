package Oving3_sortering;

public class Main {

    private final static int ANTALL = 1000000;
    private final static int MAX = 100;
    private final static int DV = 75;

    public static void main(String[] args) {
        int[] numbers = new int[ANTALL];

        java.util.Random r = new java.util.Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = r.nextInt(MAX);
//            numbers[i]=-i;
        }
/*

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        numbers = Algoritme.sort(numbers,DV,2);

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\n");
*/

        int[] finalNumbers = numbers;
        System.out.println("Uten shellsort: "+Tidtaker.getTid(()-> Algoritme.sort(finalNumbers,DV,1)));
        System.out.println("Med shellsort:  "+Tidtaker.getTid(()-> Algoritme.sort(finalNumbers,DV,2)));


    }

}
