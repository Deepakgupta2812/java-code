public class ReverseHalfStartingArr {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 60, 70, 80, 90, 100};
        int startIdx = 0;
        int endIdx = (arr.length/2)- 1;
        while (startIdx < endIdx) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
        for (int num : arr) {
            System.out.println(num);

        }
    }
}


