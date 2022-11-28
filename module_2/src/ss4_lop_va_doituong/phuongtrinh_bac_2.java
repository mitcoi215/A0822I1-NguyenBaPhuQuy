package ss4_lop_va_doituong;

import java.util.Scanner;

public class phuongtrinh_bac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        //int a= Integer.parseInt(sc.nextLine());
        //  double a= Double.parseDouble(sc.nextLine());
        int a = sc.nextInt();
        System.out.println("Nhap b : ");
        int b = sc.nextInt();
        System.out.println("Nhap c : ");
        int c = sc.nextInt();
        double x1, x2, delta;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh VO SO nghiem ");
                } else {
                    System.out.println("Phuong trinh VO nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat" + (-c / b));
            }
        } else {
            delta = (b * b - 4 * a * c);
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem x1= " + x1);
                System.out.println("Nghiem x2= " + x2);
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + (-b / 2 * a));
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}


