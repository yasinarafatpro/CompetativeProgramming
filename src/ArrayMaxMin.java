
public class ArrayMaxMin {
    static class Pair{
        int max;
        int min;
    }
    public static void main(String[]args){
        int array[]={13};
        int arraySize=array.length;
        Pair minmax=getMinmax(array,arraySize);
        System.out.println("Max number of array "+minmax.max);
        System.out.println("Min number of array "+minmax.min);
    }

    private static Pair getMinmax(int[] array, int arraySize) {
        Pair minmax=new Pair();
        //for one element
        if (arraySize==1) {
            minmax.max = array[0];
            minmax.min = array[0];
            return minmax;
        }
        //for two element
        if (array[0]>array[1]) {
            minmax.max = array[0];
            minmax.min = array[1];
        }else {
            minmax.max=array[1];
            minmax.min=array[0];
        }
        //for more then two elements
        for (int i=2;i<arraySize;i++){
            if (array[i] >minmax.max){
                minmax.max=array[i];
            }else if (array[i]<minmax.min){
                minmax.min=array[i];
            }
        }
        return minmax;
    }
}
//1 2 3 4
//one element
//more then one element