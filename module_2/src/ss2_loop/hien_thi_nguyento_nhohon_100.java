package ss2_loop;

public class hien_thi_nguyento_nhohon_100 {
    public static void main(String[] args) {
//        Nhap de nguyen to nho hon n!
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 100;
        for (int i = 2; i < n; i++) {
            int temp = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    temp = 0;
                }
            }
            if (temp == 1) {
                System.out.println(i + " ");
            }
        }
    }
}
