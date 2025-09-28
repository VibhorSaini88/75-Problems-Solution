package EveryDay75;


import java.util.*;
import java.util.stream.Collectors;

public class Union_of_two_sorted_arrays {

    public static void main(String[] args) {
        int[] farr = {99, 100, 25, -3, 42, 0, 17, -99, 56, 25, -7, 99};
        int[] sarr = {99, 100, 255, -4, 42, 0, 17, -999, 56, 25, -77, 99};

        //first way:
        int count = 0;
        int[] uniarr  = new int[farr.length+sarr.length];
        for(int index=0; index<farr.length; index++){
            uniarr[index] = farr[index];
            count += 1;
        }
        int next = count;
        for(int index=0; index<sarr.length; index++){
            uniarr[next] = sarr[index];
            next++;
            count += 1;
        }
        uniarr = Arrays.stream(uniarr).distinct().toArray();
        System.out.println("|| First way: || "+Arrays.toString(uniarr)+"\n"+count);

        //Second way:
        Set<Integer> set = new LinkedHashSet<>();
        for(int value: farr){
            set.add(value);
        }
        for(int value: sarr){
            set.add(value);
        }
        int[] unionArr = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("|| Second way: || "+Arrays.toString(unionArr));

        //Third way:
        List<Integer> flist = Arrays.stream(farr).boxed().toList();
        List<Integer> slist = Arrays.stream(sarr).boxed().toList();
        Set<Integer> finalset = new HashSet<>(flist);
        finalset.addAll(slist);
        System.out.println("|| Third way: || "+finalset);

    }
}
