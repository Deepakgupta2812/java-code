package ClassAndObject;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number from 1 to 7");
        int day= sc.nextInt();
//    OldSwitch(day);
        newSwitch(day);
    }
    public static void newSwitch(int day){
        String daystr=switch (day){
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            case 7->"Sunday";
            default -> "invalid";
        };
        System.out.println(daystr);

    }
    public static void  OldSwitch(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");
    }
}
}
