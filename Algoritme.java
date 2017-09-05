package Oving3_sortering;

import java.util.Arrays;

class Algoritme {
    private static int[] numbers;
    private static int number,DV,ST;

    static int[] sort(int[] values, int delverdi, int sorttype){
        if(values.length < 1 || values == null) return null;

        numbers = Arrays.copyOf(values,values.length);
        number = values.length;
        DV = delverdi;
        ST = sorttype;
        quicksort(0, number - 1);

        return numbers;
    }

    private static void quicksort(int low, int high) {
        int i = low, j = high;

        //Uses shellsort if the array.length is lower than the preset
        if(high - low < DV && ST == 2){
            shellsort(low, high);
            return;
        }

        // Get the pivot element from the middle of the list
        int pivot = numbers[median3sort(low,high)];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }
    private static void shellsort(int low, int high){
        int s = (high - low)/2;
        while(s > 0){
            for (int i = s+low; i < high+1; ++i) {
                int j = i,flytt = numbers[i];
                while(j >= low+s && flytt < numbers[j-s]){
                    numbers[j] = numbers[j-s];
                    j -= s;
                }
                numbers[j] = flytt;
            }
            s = (s ==2) ? 1 : (int)(s/2.2);
        }
    }

    private static int median3sort(int low, int hi){
        int m = (low + hi)/2;
        if(numbers[low]>numbers[m]){
            exchange(low,m);
        }if(numbers[m]>numbers[hi]){
            exchange(m,hi);
            if(numbers[low]>numbers[m]){
                exchange(low,m);
            }
        }
        return m;
    }

    private static void exchange(int i, int j){
        int help = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = help;
    }
}
