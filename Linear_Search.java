package EveryDay75;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 99,100, 25, -3, 42, 0, 17, -99, 56,25, -7, 99 };

        //first way:
        int element = 6;
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(element == arr[i]){
                System.out.println("given element is: || "+element+" || on index of array: "+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(" || not found element: ||");
        }

        //second way: Stream api
        System.out.println(IntStream.range(0,arr.length).filter(value -> arr[value]==element).findFirst().orElse(-1));
    }
}
