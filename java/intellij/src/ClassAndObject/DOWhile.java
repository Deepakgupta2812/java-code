package ClassAndObject;

import java.util.Scanner;

public class DOWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
    do {
        System.out.print(" Enter your age :");
      age =sc.nextInt();
    }while (age<0||age>100);
        System.out.print("Your age is "+ age);
//        while (age<0|| age>100){
//            System.out.println("Please enter your age :");
//            age= sc.nextInt();
//        }
//        System.out.println("Your age is :"+age);

    }
}
