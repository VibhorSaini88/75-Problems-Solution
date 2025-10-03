package EveryDay75;

import java.util.Arrays;

public class Two_Sum_Problem {
    public static void main(String[] args) {
        int[] arr = { 99,100, 25, -3, 42, 0, 17, -99, 56,25, -7, 99 };

        //First way: Brute Force (O(n²))
        int target = 17;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("| sum of two Indices represent target: | \""+Arrays.toString(new int[]{i, j})+"\"");
                }
            }
        }



    }
}
