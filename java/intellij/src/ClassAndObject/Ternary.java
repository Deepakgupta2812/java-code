package ClassAndObject;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number :");
        int n=sc.nextInt();
        System.out.print("Enter your second number :");
        int m=sc.nextInt();
        int greaternumber;

//        if (n>m){
//            greaternumber=n;
//
//        }else {
//            greaternumber=m;
//        }
//        System.out.println("first is greater "+greaternumber);
        int greaterNumber=n>m?n:m;
        System.out.println("first is greater "+greaterNumber);
    }
}
