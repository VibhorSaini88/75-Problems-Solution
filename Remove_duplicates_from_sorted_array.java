package EveryDay75;

import java.util.*;

public class Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 99,100, 25, -3, 42, 0, 17, -99, 56,25, -7, 99 };

        //first way
        Set<Integer> sett = new HashSet<>();
        for(int value: arr){
            sett.add(value);
        }
        System.out.println("|| First way: || "+sett); //un-ordered elements

        //Second Way
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println("|| Second way: || "+set); //order maintain

        //third way
        List<Integer> listArr = new ArrayList<>();
        for(int value: arr){
            if(!listArr.contains(value)) {
                listArr.add(value);
            }
        }
        arr = listArr.stream().mapToInt(Integer::intValue).toArray(); //convert int[] arr
        System.out.println("|| Third way: || "+Arrays.toString(arr));

    }
}
