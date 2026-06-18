package ClassAndObject;

public class Driver {

    public static void main(String[] args) {
        Car mycar=new Car();//constructor
        mycar.addFuel(6);
        mycar.drive();
        mycar.drive();
        mycar.drive();
        mycar.drive();
        mycar.addFuel(3);
        System.out.println(mycar.getCurrentFuelLevel());

    }
}
