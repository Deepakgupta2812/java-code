public class RemoveDuplicacy {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        int[] temp = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Add the last element
        temp[j] = arr[arr.length - 1];
        j++;

        // Print only unique elements
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}


//import java.util.*;
//
//class Result {
//
//    public static List<Integer> removeDuplicate(int n, List<Integer> arr) {
//
//        return new ArrayList<>(new LinkedHashSet<>(arr));
//    }
//}