package progarmja;

import java.util.Scanner;

public class BitCompliment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number :");
        int num=sc.nextInt();
        int result=~num;
        System.out.print("Result = "+result);
    }
}
