package EveryDay75;

import java.util.*;
import java.util.stream.Collectors;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] farr = {99, 100, 25, -3, 42, 0, 17, -99, 56, 25, -7, 99};
        int[] sarr = {99, 100, 255, -4, 42, 0, 17, -999, 56, 25, -77, 99};

        //first way:
        Set<Integer> intersec = new HashSet<>();
        for (int i = 0; i < farr.length; i++) {
            for (int j = 0; j < sarr.length; j++) {
                if (farr[i] == sarr[j]) {
                    intersec.add(farr[i]);
                }
            }
        }
        System.out.println("|| Intersection of First way: || " + intersec);

        //Second way:
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : farr) {
            set1.add(num);
        }
        for (int num : sarr) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("|| Intersection of Second way: || " + intersection);

        //Third way: Stream APi
        Set<Integer> set2 = Arrays.stream(sarr).boxed().collect(Collectors.toSet());
        Set<Integer> resultSet = Arrays.stream(farr)
                .distinct()
                .filter(set2::contains)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("|| Intersection of Third way: ||  " + resultSet);

    }
}
