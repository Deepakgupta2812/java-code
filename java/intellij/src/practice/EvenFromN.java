package practice;

import java.util.Scanner;

public class EvenFromN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        int i=1;
        while (i<=n){
            if (i%2==0){
                System.out.println(" Even number :"+i);
            }
            i++;
        }
    }
}
