public class ReverseArrWithSwap {
    public static void main(String[] args) {
        int [] arr={20,30,40,50,60,70,80,90,100};
        int startIdx=0;
        int endIdx=arr.length-1;
        while(startIdx<endIdx){
            int temp=arr[startIdx];
            arr[startIdx]=arr[endIdx];
            arr[endIdx]=temp;
            startIdx++;
            endIdx--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Array["+i+"]="+arr[i]);
        }
//        for (int num=0;num<endIdx;num++){
//            System.out.print(num+" ");
//        }
    }
}
