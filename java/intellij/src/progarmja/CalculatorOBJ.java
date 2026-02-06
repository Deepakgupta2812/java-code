package progarmja;

import java.util.Scanner;

public class CalculatorOBJ {
    int a,b;
    Scanner sc=new Scanner(System.in);
    int addition(){
        System.out.println("Enter 2 number for addition : ");
        a=sc.nextInt();
        b=sc.nextInt();
        return (a+b);
    }
    int subtracton(){
        System.out.println("Enter 2 number for subtraction : ");
        a=sc.nextInt();
        b=sc.nextInt();
        return (a-b);
    }
    int multiplication(){
        System.out.println("Enter 2 number for multiplication : ");
        a=sc.nextInt();
        b=sc.nextInt();
        return (a*b);
    }
    int division(){
        System.out.println("Enter 2 number for division : ");
        a=sc.nextInt();
        b=sc.nextInt();
        return (a/b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("Enter the number :");
        int choice= sc.nextInt();
        CalculatorOBJ obj=new CalculatorOBJ();
        int ans=0;

        switch (choice){
            case 1:
            ans= obj.addition();
            break;
            case 2:
            ans=obj.subtracton();
            break;
            case 3:
            ans=obj.multiplication();
            break;
            case 4:
             ans=obj.division();
             break;
            default:
                System.out.println("Wrong Selection");
        }
        System.out.println("Answer ="+ans);
    }
}
