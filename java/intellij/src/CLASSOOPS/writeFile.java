package CLASSOOPS;
import java.io.*;
public class writeFile {
    public static void main(String[] args) {
        try {
            BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\deepa\\OneDrive\\Desktop\\intellij\\src\\CLASSOOPS\\sample.txt"));
            br.write("Hello\n");
            br.write("Ram\n");
            br.write("Krishna\n");
            br.write("Radha\n");
            br.close();
        } catch (Exception e) {
            return;
        }
    }
}
