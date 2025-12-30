package ClassAndObject;

import java.util.Scanner;

public class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");
        int month= sc.nextInt();
        String out=switch (month){
            case 1->"January";
            case 2->"Fab";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"july";
            case 8->"August";
            case 9->"September";
            case 10->"Octo";
            case 11->"Nav";

            case 12->"December";
            default -> "Invalid";
        };
        System.out.println(out);

    }
}
