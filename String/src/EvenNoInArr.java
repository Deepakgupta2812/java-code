public class EvenNoInArr {
    public static void main(String[] args) {
        int arr[]={2,4,6,3,5,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even number in the array is: "+sum);
    }
}
