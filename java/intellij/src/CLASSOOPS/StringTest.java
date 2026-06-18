package CLASSOOPS;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("first");
        sb.append(45);
        sb.append(", now this is the");
        sb.append(76.45);
        String string = sb.toString();
        System.out.println(string);
    }
}
