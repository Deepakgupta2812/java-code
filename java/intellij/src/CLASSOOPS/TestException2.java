package CLASSOOPS;

public class TestException2 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block");
            int data=(25/0);
            System.out.println("Data="+data);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Inside the finally block");
        }
        System.out.println("Rest of the code");
    }
}
