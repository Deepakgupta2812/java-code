import java.util.Arrays;

public class CopyOddElemArr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,3,5,6,7,8,9};
        int [] arr1=new int [arr.length];
        System.out.println(Arrays.toString(arr));


        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                arr1[i]=arr[i];
            }
        }
        System.out.println("Only Odd Elements:"+ Arrays.toString(arr1));

    }
}
