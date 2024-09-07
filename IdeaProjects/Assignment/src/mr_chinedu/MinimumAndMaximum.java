package mr_chinedu;

import java.util.Arrays;

public class MinimumAndMaximum {
    public int [] minimumAndMaximum(int [] array) {
        int min = array[0];
        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) array[0] = array[index];
            if (array[index] > max) array[1] = array[index];
        }
      return  Arrays.copyOfRange(array,0, 2);

    }

    public static void main(String[] args) {
        MinimumAndMaximum minimumAndMaximum = new MinimumAndMaximum();
        System.out.println(Arrays.toString(minimumAndMaximum.minimumAndMaximum(new int [] {1,2,3,4,5})));
         System.out.println(Arrays.toString(minimumAndMaximum.minimumAndMaximum(new int [] {2,3,4,5,6,7,8})));
        System.out.println(Arrays.toString(minimumAndMaximum.minimumAndMaximum(new int [] {5,3,6,9,8 })));

    }
}
