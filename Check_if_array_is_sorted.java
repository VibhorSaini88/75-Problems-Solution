package EveryDay75;

import java.util.*;

public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        int[] arr = { 100, 25, -3, 42, 0, 17, -99, 56, -7, 99 };
        Arrays.sort(arr);

        //first way
            if(arr[0]>arr[1]){
                dscending(arr);
            }else{
                ascending(arr);
            }

        //Second way
        int[] cloneArr = arr.clone();
        Arrays.sort(cloneArr);
        System.out.println("cloneArr.equals(arr): "+cloneArr.equals(arr));

    }

    public static void dscending(int[] arr){
        boolean flag = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("sorted with Descending order: ");
        }
    }

    public static void ascending(int[] arr){
        boolean flag = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        if(!flag){
            System.out.println("sorted with Aescending order: ");
        }
    }
}
