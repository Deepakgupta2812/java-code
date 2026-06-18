package progarmja;

import java.util.Scanner;

public class BitXor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in );
        System.out.print("Enter a number :");
        int a=input.nextInt();
        System.out.print("Enter the another number :");
        int b=input.nextInt();
        int result=a^b;
        System.out.println("Result ="+result);
    }
}
