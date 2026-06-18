package CLASSOOPS;

public class TestThrow {
    public static void checkNum(int num){
        if (num<0){
            throw new ArithmeticException("Negative NUmber :"+num);
        }else {
            System.out.println("Positive NUmber :"+num);
        }
    }
    public static void main(String[] args) {
        TestThrow obj=new TestThrow();
        obj.checkNum(-3);
    }
}
