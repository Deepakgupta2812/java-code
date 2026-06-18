package ClassAndObject;

public class FOREACH {
    public static void main(String[] args) {
        String [] array= new String[]{
                "RAM","Shyam"
        };
    //printarray(array);
    printarrayForEach(array);
    }
    public  static void  printarrayForEach(String[] array){
    for (String name:array){
        System.out.println(name);
    }
    }

    public  static void  printarray(String[] array){
        for (int i=0;i<array.length;i++){
         //   System.out.println(array[i]);
        }
    }

}
