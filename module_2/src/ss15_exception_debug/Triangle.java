package ss15_exception_debug;

import java.util.Scanner;

public class Triangle {
    private static int a;
    private static int b;
    private static int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Triangle() {
    }

    public static void checkedgeOfTriangle(int a, int b,int  c) throws TriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleException("Fail!");
        } else if (a + b <= c || b + c <= a || a + c < b) {
            throw new TriangleException(" Fail");
        } else {
            System.out.println("Active!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean flag =false;
        do{
            flag=false;
            System.out.println(" Enter 3 edge of triangle:");
            int aEdge;
            int bEdge;
            int cEdge;
            try {
                aEdge=Integer.parseInt(scanner.nextLine());
                bEdge=Integer.parseInt(scanner.nextLine());
                cEdge=Integer.parseInt(scanner.nextLine());
                checkedgeOfTriangle(aEdge,bEdge,cEdge);
            }catch (TriangleException e){
                flag=true;
                e.printStackTrace();
                System.out.println("Fail!! Enter again edge!!");
            }catch (NumberFormatException e ){
                flag=true;
                e.printStackTrace();
                System.out.println("Fail!!!! Enter String");
            }
        }while (flag);
    }
}
