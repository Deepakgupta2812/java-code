import java.util.Scanner;

public class towerOfHanoi {
    public static void towerOfHanoi(int n, String sourse, String helper, String dest) {
    if(n == 1) {
    System.out.println("transfer disk " + n + " from " + sourse + " to " + dest);
    return;
    }
    //transfer top n-1 from src to helper using dest as 'helper'
    towerOfHanoi(n-1, sourse, dest, helper);
    //transfer nth from src to dest
    System.out.println("transfer disk " + n + " from " +sourse+ " to " + helper);
    //transfer n-1 from helper to dest using src as 'helper'
    towerOfHanoi(n-1, helper, sourse, dest);
    }
    public static void main(String args[]) {
        System.out.println("enter the number of disk : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
 
    towerOfHanoi(n, "S", "H", "D");
    }
    }