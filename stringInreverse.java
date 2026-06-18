import java.util.Scanner;

public class stringInreverse {
    public static void printRev(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;

        }
        System.out.println(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the string that you want to print in reverse order :");
       Scanner sc=new Scanner(System.in);
       String str= sc.nextLine();
       printRev(str,str.length()-1);
    }
}
