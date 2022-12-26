package ss14_sort;

import java.util.Arrays;

public class InsertionSortSimulator {
    public static void InsertionSort(int[] array) {
        int pos, flag;
        for (int i = 1; i < array.length; i++) {
            System.out.println("CLOUD " + i + ": " + Arrays.toString(array));
            flag = array[i];
            pos = i;
            while (pos > 0 && flag < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = flag;
            System.out.print("Cloud" + i + ":" + Arrays.toString(array));

        }
    }

    public static void main(String[] args) {
        int[] numberAray = {99, 2, 22, 11, 44, 33, 23, 20};
        System.out.print(" Array :");
        System.out.print(Arrays.toString(numberAray));
        InsertionSort(numberAray);
        System.out.print(" After sort " + Arrays.toString(numberAray));
    }
}
