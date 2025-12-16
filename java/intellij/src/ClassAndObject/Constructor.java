package ClassAndObject;

public class Constructor {
    String color;
    float price;
    Constructor(){
        color="black";
        price=50000;
    }

    public static void main(String[] args) {
        Constructor swift = new Constructor();
        swift.color();
    }

    private Constructor color() {
        return null;
    }
}
