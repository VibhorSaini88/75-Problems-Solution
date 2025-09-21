package EveryDay75;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Largest_Element_In_Array {

    public static void main(String[] args) {
        int[] arr = { 100, 25, -3, 42, 0, 17, -99, 56, -7, 99 };

        //First Way//
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("max: "+max);
        

        //Second way using Stream api.
        System.out.println(IntStream.of(arr).boxed().max(Comparator.comparingInt(Integer::intValue)).get());
        //OR//
        System.out.println(Arrays.stream(arr).max().getAsInt());
        //OR
        System.out.println(IntStream.of(arr).max().getAsInt());


        //Third way: Collection f/w
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        //OR
        Integer[] array = { 100, 25, -3, 42, 0, 17, -99, 56, -7, 99 };
        Integer d = Collections.max(Arrays.asList(array));
        System.out.println("max element is: "+d);
        //OR
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(Arrays.asList(array));
        System.out.println("max element is: "+priorityQueue.peek());
        System.out.println("max element is: "+priorityQueue.poll());
    }
}
