package practice;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
        if (i%2==0){
            System.out.println(" The number of even number is "+i);

        }else
            System.out.println("The number of odd number is "+i);
        }
    }
}
