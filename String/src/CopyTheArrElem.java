import java.util.Arrays;

public class CopyTheArrElem {
    public static void main(String[] args) {
        int [] arr={3,4,5,6,2,7};
        int [] arr1= new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("original:"+arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }

}
