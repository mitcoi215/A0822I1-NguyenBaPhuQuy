package ss1_introduction_java;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your name ");
        String name = scanner.nextLine();
        System.out.println(" Hello "+name);
    }
}
