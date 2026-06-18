package ClassAndObject;

public class Car {
    int numOfwheel;
    String color;
    float maxspeed;
    float currentfluelinL;
    int numOfSeat;

    public void drive(){
        if (currentfluelinL==0){
            System.out.println("Car is out of fuel");
        } else if (currentfluelinL<5) {
            System.out.println("Car is in reserved mode , please refuel");
        }else {
            System.out.println("Car is driving");
        }
        currentfluelinL--;
    }
    public void addFuel(float fuel){
        currentfluelinL+=fuel;
    }
    public float getCurrentFuelLevel() {
        return currentfluelinL;
    }

}
