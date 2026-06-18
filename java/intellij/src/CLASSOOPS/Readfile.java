
package CLASSOOPS;
import java.io.*;
public class Readfile {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\deepa\\OneDrive\\Desktop\\intellij\\CLASSOOPS\\sample.txt"));
            String s;
            while ((s= br.readLine())!=null){
                System.out.println(s);
            }
        } catch (Exception e) {
            return;
        }
    }
}
