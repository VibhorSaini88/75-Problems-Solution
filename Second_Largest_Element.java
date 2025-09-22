package EveryDay75;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = { 100, 25, -3, 42, 0, 17, -99, 56, -7, 99 };

        int n = arr.length;
        if (n < 2) {
            System.out.println("Not enough elements..!");
        }else {
            //first way
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for(int value : arr){
                if(value>first){
                    second = first;
                    first = value;
                }else if(value > second && value != first){
                    second = value;
                }
            }
            System.out.println("|| Second_Largest_Element: || "+second);

            //Second way
            Arrays.sort(arr);
            System.out.println("|| Second_Largest_Element: || "+arr[arr.length-2]);

            //Third Way
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int num : arr) {
                pq.add(num);
            }
            Integer largest = pq.poll();
            if (!pq.isEmpty()) {
                Integer next = pq.poll();
                if (!next.equals(largest)) {
                    System.out.println("|| Second_Largest_Element: || "+next);
                }
            }
        }
    }
}
