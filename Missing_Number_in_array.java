package EveryDay75;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Missing_Number_in_array {
    public static void main(String[] args) {
        int[] farr = {3, 0, 1};

        //First way:
        int orgRes = farr.length * (farr.length+1)/2;
        int sum = 0;
        for(int value : farr){
            sum += value;
        }
        System.out.println("|| First way: Missing number: || "+(orgRes-sum));

        //Second way: using sorting
        Arrays.sort(farr);
        int diff = 0;
        for(int i=0; i<farr.length-1; i++){
           if(farr[i] + 1 != farr[i+1]){
               diff = farr[i] + 1;
               break;
           }
        }
        System.out.println("|| Second way: Missing number: || "+diff);

        //Third way: Using Collection f/w:
        List<Integer> list = Arrays.stream(farr).boxed().toList();
        int min = Collections.min(list);
        int max = Collections.max(list);
        Set<Integer> set = new HashSet<>(list);
        int missing = -1;
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
        System.out.println("|| Missing number (Collections Framework): || " + missing);

        //Fourth way: Using Stream api:
        int minn = Arrays.stream(farr).min().getAsInt();
        int maxx = Arrays.stream(farr).max().getAsInt();
        //Find missing numbers using Streams
        List<Integer> missingNumbers = IntStream.rangeClosed(minn, maxx)
                .filter(num -> Arrays.stream(farr).noneMatch(x -> x == num))
                .boxed()
                .toList();
        System.out.println("|| Missing numbers (Stream API): || " + missingNumbers);

    }
}
