package EveryDay75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_0s_1s_and_2s {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 1, 1, 0, 0, 0, 0, 0};

        //First way
//        Arrays.sort(arr); // simple one-liner
//        System.out.println(Arrays.toString(arr));

        //Second way:
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }else if (arr[i] == 1){
                ones++;
            }else{
                twos++;
            }
        }
        for(int value: arr){
            System.out.print(value+" | ");
        }
        System.out.println();
        for(int i=0; i< arr.length-(ones+twos); i++){
                arr[i] = 0;
        }
        for(int j= arr.length-zeros; j<arr.length-(zeros+twos); j++){
            arr[j] = 1;
        }
        for(int k=arr.length-(zeros+ones); k< arr.length; k++){
            arr[k] = 2;
        }
        for(int value: arr){
            System.out.print(value+" | ");
        }

        //Third way: Stream api
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 1, 2, 1, 1, 0, 0, 0, 0, 0));
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
