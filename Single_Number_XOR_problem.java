package EveryDay75;

import java.util.HashMap;
import java.util.Map;

//You are given a non-empty array of integers.
//Every element appears twice, except for one element which appears only once.
//Find that single element.
public class Single_Number_XOR_problem {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        //First way
        int result = 0;
        for(int value: arr){
            result ^= value;
        }
        System.out.println("|| Single Number: || "+result);

        //second way: Collection f/w
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("|| Single Number (HashMap): || " + entry.getKey());
                break;
            }
        }

        
    }
}
