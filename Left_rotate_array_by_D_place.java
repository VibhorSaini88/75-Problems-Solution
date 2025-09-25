package EveryDay75;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Left_rotate_array_by_D_place {
    public static void main(String[] args) {
        int[] arr = { 99,100, 25, -3, 42, 0, 17, -99, 56,25, -7, 99 };

        //First way
        System.out.println("   || ********** First way o/p *********** ||");

        Scanner stream = new Scanner(System.in);
        System.out.println("enter place: 1 to "+arr.length);
        int input = stream.nextInt();
        for(int j=0; j<input; j++){
            int temp = arr[0];
            for(int i=1; i<arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("   || ********** Second  way o/p *********** ||");

        
        //Second way: Collection f/w
        List<Integer> list = new ArrayList<>(Arrays.asList(99, 100, 25, -3, 42, 0, 17, -99, 56, 25, -7, 99));
        System.out.println("enter place: 1 to "+arr.length);
        int d = stream.nextInt();
        Collections.rotate(list, -d);  // negative(-d) = left rotate
        System.out.println(list);

    }
}
