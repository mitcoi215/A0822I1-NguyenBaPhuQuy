package ss3_mang_va_phuongthuc;

import java.util.Scanner;

public class tong_cac_so_o_mot_cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number :");
        int row = sc.nextInt();
        System.out.println("Enter column number :");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "]:");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Enter the column you want to sum :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == n) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of the column " + n + " is : " + sum);
    }
}
