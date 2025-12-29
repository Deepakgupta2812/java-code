package ClassAndObject;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
//        System.out.println("Enter an other number");
//        int m= sc.nextInt();
        String result =n%2==0?"Evrn":"Odd";
        System.out.println("Your number is "+result);
    }
}
