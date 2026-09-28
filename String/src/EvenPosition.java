public class EvenPosition {
    public static void main(String[] args) {
        int arr[]={3,5,6,8,2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even position elements: "+sum);

    }
}
