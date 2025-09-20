package EveryDay75;

import java.util.*;

public class Check_if_array_is_sorted {

    public static void ascending(int[] arr){
        boolean flag = false;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println(" || NON-Sorted Arr ||");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("sorted with Ascending order: ");
        }
    }

    public static void dscending(int[] arr){
        boolean flag = false;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                System.out.println(" || NON-Sorted Arr ||");
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("sorted with Descending order: ");
        }
    }

    public static void checkArrOrder(int[] arr){
            if(arr[0]>arr[1]){
                dscending(arr);
            }else {
                ascending(arr);
            }

    }


    public static void main(String[] args) {
        int[] arr = { 100, 25, -3, 42, 0, 17, -99, 56, -7, 99 };

        //give unsorted array to check//
        checkArrOrder(arr);

        //give Ascending order array to check//
        Arrays.sort(arr);
        checkArrOrder(arr);

        //give Descending order array to check//
        arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        checkArrOrder(arr);

        //first way
            if(arr[0]>arr[1]){
                dscending(arr);
            }else{
                ascending(arr);
            }

        //Second way
        int[] array = { 100, 25, -3, 42, 0, 17, -99, 56, -7, 99 };
        int[] cloneArr = array.clone();
        Arrays.sort(cloneArr);
        System.out.println("Given Array is sorted(true) or not(false): "+cloneArr.equals(arr));

    }


}
