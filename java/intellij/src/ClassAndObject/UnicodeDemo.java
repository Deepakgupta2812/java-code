package ClassAndObject;

public class UnicodeDemo
{
    public static void main(String ar[]) throws Exception
    {
        String str1 = "Unicode Sytem\u00A9";
        byte[] charset = str1.getBytes("UTF-8");
        String newstr = new String(charset, "UTF-8");
        System.out.println(newstr);
    }
}