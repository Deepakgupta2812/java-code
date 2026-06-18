package CLASSOOPS;

import progarmja.OccurancesArray;

import java.util.Scanner;

public class DeletingFROMarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numarr=arrayUtility.inputArray();
        System.out.println("Now , enter the number you want to delete :");
        int numToDelete= sc.nextInt();
        int[] newarr= deleteNumber(numarr,numToDelete);
        System.out.println("Here is your new array: ");
        arrayUtility.displayarray(newarr);
    }
    public static int[] deleteNumber(int[] numarr,int numToDelete){
        int occ= OccurancesArray.noOfOcurrences(numarr,numToDelete);
        if (occ==0){
            return numarr;
        }
        int newsize=numarr.length-occ;
        int[] newarr=new int[newsize];
        int i=0,j=0;
        while (i<numarr.length){
            if (numarr[i]!=numToDelete){
                newarr[j]=numarr[i];
                j++;
            }
            i++;
        }


        return newarr;

    }
}
