package ss3_mang_va_phuongthuc;
import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 5, 6, 11, 22, 33, 55, 33, 4};
        System.out.println("Enter the value need to delete :");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
                System.out.println("Has the value " + n + " in the array at position :" + i);
            }
        }
        int[] array2 = new int[array.length - count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
                for (int j = 0; j < array2.length; j++) {
                    array2[j] = array[j];
                }
            }
        }
        System.out.println(Arrays.toString(array2));

    }
}
