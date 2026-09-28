public class ReverseHalfEndArr {
    public static void main(String[] args) {
        int [] arr={20,30,40,50,60,70,80,90,100};
        int startIdx=arr.length/2;
        int endIdx=arr.length-1;
        while(startIdx<endIdx){
            int temp=arr[startIdx];
            arr[startIdx]=arr[endIdx];
            arr[endIdx]=temp;
            startIdx++;
            endIdx--;
        }
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
