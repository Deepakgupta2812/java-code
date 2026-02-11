package progarmja;

import java.util.Scanner;

public class fibbo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" please ! Enter your number :");
        int num= input.nextInt();
        System.out.println("Here is the fibbonacci series :");
        fibbonacci(num);
    }
    public static void fibbonacci(int num){
        if (num<0)return;
        System.out.println("0");
        if (num==0)return;
        System.out.println("1 ");
        int a=0,b=1;
        while (a+b<=num){
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }

    }
}
