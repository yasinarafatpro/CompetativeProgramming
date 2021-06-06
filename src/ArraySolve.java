import java.util.Arrays;

public class ArraySolve  {
    public static void main(String args[]) {
        int[] array = {5, 4, 3, 2, 1};
        print(Arrays.toString(array));
        for(int j=0;j<array.length-1;j++) {
            for (int i = 0; i <array.length-1-j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            print(Arrays.toString(array));
        }
        print(Arrays.toString(array));
    }

    private static void print(String s) {
        System.out.println(s);
    }
}

