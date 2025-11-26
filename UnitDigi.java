import java.util.Scanner;

public class UnitDigi{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for the first number
        System.out.print("Enter the base of the first number: ");
        int base1 = scanner.nextInt();
        System.out.print("Enter the exponent of the first number: ");
        int exponent1 = scanner.nextInt();
        
        // Read input for the second number
        System.out.print("Enter the base of the second number: ");
        int base2 = scanner.nextInt();
        System.out.print("Enter the exponent of the second number: ");
        int exponent2 = scanner.nextInt();

        int unitDigit1 = getUnitDigit(base1, exponent1);
        int unitDigit2 = getUnitDigit(base2, exponent2);
        
        int productUnitDigit = (unitDigit1 * unitDigit2) % 10;
        // print the unit digit
        System.out.println("The unit's digit in the product is: " + productUnitDigit);

        scanner.close();
    }

    private static int getUnitDigit(int base, int exponent) {
        base = base % 10; // Get the unit digit of the base
        int[] pattern = new int[4];
        
        // Generate the pattern of unit digits
        pattern[0] = base;
        for (int i = 1; i < 4; i++) {
            pattern[i] = (pattern[i - 1] * base) % 10;
        }
        
        int patternIndex = (exponent - 1) % 4;
        return pattern[patternIndex];
    }
}
