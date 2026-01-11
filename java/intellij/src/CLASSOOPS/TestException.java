package CLASSOOPS;

public class TestException {
    public static void main(String[] args) {
        try {
            int data=(25/5);
            System.out.println("Inside the try block");
        }
        catch (ArithmeticException e){
            System.out.println("Inside the catch block");
        }
        finally {
            System.out.println("Inside the finally block");
        }
        System.out.println("Rest of code");
    }
}
