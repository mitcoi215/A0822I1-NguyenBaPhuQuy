package ss14_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] numberArray = {5,6,4,3,7,9,2};
        System.out.print(" Array:");
        System.out.println(Arrays.toString(numberArray));
        System.out.print(" Alert Sort :");
        insertionSort(numberArray);
        System.out.print(Arrays.toString(numberArray));
    }
}
