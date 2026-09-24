import java.util.Arrays;

public class CopyInRevOrderArr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] arr1=new int [arr.length];
        int startIdx=0;
        int endIdx=arr.length-1;

        // Loop through the entire array length using startIdx and endIdx
        while(startIdx < arr.length){
            // FIX: Take the element from the end of 'arr' and place it at the start of 'arr1'
            arr1[startIdx] = arr[endIdx];

            startIdx++; // Moves forward from 0 to the end
            endIdx--;   // Moves backward from the last index to 0
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Copy: " + Arrays.toString(arr1));
    }
}
