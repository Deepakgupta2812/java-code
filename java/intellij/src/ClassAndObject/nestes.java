package ClassAndObject;

import java.util.Scanner;

public class nestes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a marks");
        int marks= sc.nextInt();
        String category=marks>80?"High":(marks>50?"Morderate":"low");
        System.out.println("Your category is :"+category);
    }
}
