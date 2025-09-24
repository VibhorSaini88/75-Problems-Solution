package EveryDay75;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Left_rotate_array_by_one_place {
    public static void main(String[] args) {
        int[] arr = { 99,100, 25, -3, 42, 0, 17, -99, 56,25, -7, 99 };

        //First way
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));

        //Second way
        int[] rotated = new int[arr.length];
        System.arraycopy(arr, 1, rotated, 0, arr.length - 1); // copy from index 1
        rotated[arr.length - 1] = arr[0]; // set first element at last
        for (int num : rotated) {         // print array
            System.out.print(num + " ");
        }

        //Third: Using Collections f/w & Stream api
        Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(arrInteger);
        Collections.rotate(list, -1); // rotate left by 1
        arr = list.stream().mapToInt(Integer::intValue).toArray();  // convert back to int[]
        for (int num : arr) {
            System.out.print(num + " ");  // print array
        }


    }
}
