package Oving3_sortering;

public class Main {

    private final static int ANTALL = 200;
    private final static int MAX = 20;

    public static void main(String[] args) {
        Data d = new Data();

        int[] numbers = new int[ANTALL];

        java.util.Random r = new java.util.Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = r.nextInt(MAX);
        }

        numbers = d.sort(numbers);


    }

}
