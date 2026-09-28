import java.util.Scanner;

public class SumOfAllElementInArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            }
        System.out.println("Array elements in the array are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum+=a[i];
        }
        System.out.println("Sum of all the elements in the array are: "+sum);
    }
}
