package CLASSOOPS;
import java.util.Scanner;

public class ArmstrongFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong) {
            System.out.println("Your number is an Armstrong number.");
        } else {
            System.out.println("Your number is not an Armstrong number.");
        }

    }

    public static boolean isArmstrong(int num) {
        int digits = countDigits(num);
        int numCopy = num;
        int finalNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, digits);
        }

        return finalNumber == numCopy;
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int countDigits(int num) {
        if (num == 0) return 1; // Handle 0 case
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num /= 10;
        }
        return digitCount;
    }
}
