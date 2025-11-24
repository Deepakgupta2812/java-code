import java.util.*;
public class functionMUL {
    public static int Mul(int a , int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b= sc.nextInt();
       int mul=Mul(a, b);
       System.out.println("Multiplication of 2 number is = "+mul); 
    }
}
