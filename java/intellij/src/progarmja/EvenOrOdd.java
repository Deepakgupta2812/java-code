package ggffgfg;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        float a= sc.nextFloat();
        if (a%2==0){
            System.out.println(a+" is even.");
        }
        else{
            System.out.println(a+" is odd.");
        }
    }
}
