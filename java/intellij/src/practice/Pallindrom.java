package practice;

import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        int rev=0;
        int rem;
        int tem=n;
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (rev==tem) {
            System.out.println("Number is palindrome " + rev);
        }else {
            System.out.println("Number is not palindrome ");
        }
    }
}
