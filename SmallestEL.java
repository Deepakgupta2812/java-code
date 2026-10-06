public class SmallestEL {
    public static int getSmallest(int numbers[]){
        int smallest =Integer.MAX_VALUE; // +infinity
        for(int i=0;i<numbers.length;i++){
            if (smallest>numbers[i]) {
                smallest=numbers[i];
                }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] numbers={5,3,2,6,1};
        System.out.println("The smallest Numbers is :"+getSmallest(numbers));
    }
    
}
