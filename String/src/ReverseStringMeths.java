//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseStringMeths {
    public static void main(String[] args) {
        String name ="Deepak";
        String rev="";
        int len=name.length();
//        Approach 1
        for(int i=len-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
//        System.out.println("Reverse of name :"+name +" is :"+rev);

        char[] chars=name.toCharArray();
        for(int i=len-1;i>=0;i--){
//            System.out.printf("%c",chars[i]);
        }

        StringBuffer sb=new StringBuffer(name);
//        System.out.println(sb.reverse());

        StringBuilder stringBuilder= new StringBuilder(name);
        System.out.println(stringBuilder.reverse());
    }
}