package Day6;

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        int index = Arrays.binarySearch(arr,5   );
        System.out.println(index);


        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));


        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));
    }



}
