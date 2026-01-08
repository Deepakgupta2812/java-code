package CLASSOOPS;

public class sortedArray {
    public static void main(String[] args) {
        System.out.println("welcome to array sorting check post :\n");
        int[] numarr = arrayUtility.inputArray();
        boolean isInc = isIncresing(numarr);
        boolean isDec = isDecreasing(numarr);
        if (isInc || isDec) {
            System.out.println("your array is sorted ");
        } else {
            System.out.println("your array is not sorted ");
        }
    }

    public static boolean isDecreasing(int[] numarr) {
        int i = 1;
        while (i < numarr.length) {
            if (numarr[i] > numarr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncresing(int[] numarr) {
        int i = 1;
        while (i < numarr.length) {
            if (numarr[i] < numarr[i - 1]) {
             return false;
                }
            i++;
        }
        return true;
    }
}