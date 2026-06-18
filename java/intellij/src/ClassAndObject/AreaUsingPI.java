package ClassAndObject;

import java.util.Scanner;

public class AreaUsingPI {
    double radiusInMm;
    AreaUsingPI(double radiusInMm){
        this.radiusInMm=radiusInMm;
    }
    double getCircumference(){
return 2*radiusInMm*Math.PI;

    }
    double getArea(){
        return Math.PI*Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        return "Circle props: Radius in mm: "+radiusInMm
                + ", Circumference in mm: "+getCircumference()
                +", Area in mm2:  "+getArea();

    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the world of circle\n");
        System.out.println("Please enter your radius: ");
        double radius = input.nextDouble();
        AreaUsingPI circle = new AreaUsingPI(radius);
        System.out.println(circle);

    }
}
