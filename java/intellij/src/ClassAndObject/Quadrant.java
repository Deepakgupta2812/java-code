package ClassAndObject;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean x= sc.nextBoolean();
        boolean y= sc.nextBoolean();
        if(x==true&&y==true){
            System.out.println("1 q");
        } else if (x == true && y == false) {

            System.out.println("2 ");
        }else if (x == false && y == true){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }
}
