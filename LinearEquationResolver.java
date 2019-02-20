package SS1TH4;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        int a ,b ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Phương trình bậc nhất : Ax + B = 0");
        System.out.println("Mời bạn nhập vào các hệ số : ");
        System.out.print("A = ");
        a = scn.nextInt();
        System.out.print("B = ");
        b = scn.nextInt();
        float x = 0;
        if (a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
        }else if (a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        }else {
            x = (float) -b / a;
            System.out.println("x = " + x);

        }


    }
}
