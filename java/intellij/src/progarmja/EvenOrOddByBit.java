package progarmja;

import java.util.Scanner;

public class EvenOrOddByBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        if ((a&1)==1){
            System.out.print("Your number is odd!");
        }else {
            System.out.println("Your number is even!");
        }
    }
}
