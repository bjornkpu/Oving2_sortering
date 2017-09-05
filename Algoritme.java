package Oving3_sortering;

public class Algoritme {
    int[] numbers;
    int number;

    public int[] sort(int[] values){
        if(values.length < 1 || values == null) return null;

        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);

        return numbers;
    }

    private void quicksort(int low, int high){
        int i = low, j = high;
        int pivot = numbers[low + (high-low)/2];
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }
    private static void shellsort(int[]t){
        int s = t.length/2;
        while(s > 0){
            for (int i = 0; i < t.length; i++) {
                int j = i,flytt = t[i];
                while(j >= s && flytt < t[j-s]){
                    t[j] = t[j-s];
                    j -= s;
                }
                t[j] = flytt;
            }
            s = (s ==2) ? 1 : (int)(s/2.2);
        }
    }

    private void exchange(int i, int j){
        int help = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = help;
    }
}
