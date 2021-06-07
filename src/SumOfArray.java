
public class SumOfArray {
    static int[] array={1,2,3};
   static int sum(){
       int sum=0;
       int i;
       for (i=0;i<array.length;i++)
           sum += array[i];
           return sum;
    }
    public static void main(String args[]){
        System.out.println(sum());
    }
}
