import java.util.Arrays;

public class copyhalfArr {
    public static void main(String []args)
    {
        {
            int [] arr={3,4,5,6,2,7};
            int [] arr1= new int [(arr.length)/2];
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("original:"+arr[i]);
            }
            for(int i=0;i<(arr.length)/2;i++)
            {
                arr1[i]=arr[i];
            }
            System.out.println(Arrays.toString(arr1));
        }

    }

}
