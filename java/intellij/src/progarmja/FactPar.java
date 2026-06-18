package progarmja;

import java.util.Scanner;

public class FactPar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number :");
        int num= sc.nextInt();
        long fact=factorial(num);
        System.out.println("factorial is :" +fact);
    }
    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while (i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}
