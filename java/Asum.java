
import java.util.Scanner;
public class Asum  {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int c = sc.nextInt();
        int e = sc.nextInt();
        int Total=a+b+c+d+e;
        float per=((a+b+c+d+e)/500)*100;
        System.out.println(per);
    }
}
