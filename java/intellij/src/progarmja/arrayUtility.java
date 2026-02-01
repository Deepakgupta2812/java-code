package progarmja;

import java.util.Scanner;

public class arrayUtility {
    public static  int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter number of element :");
        int size=sc.nextInt();
        int [] nums=new int[size];
        int i=0;
        while (i<size){
            System.out.println("Please enter element no "+(i+1)+":");
            nums[i]= sc.nextInt();
            i++;
        }
        return nums;
    }
}
