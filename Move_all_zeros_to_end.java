package EveryDay75;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.*;
import java.util.stream.IntStream;

public class Move_all_zeros_to_end {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        //first way: O(n) space
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {           // Copy non-zero elements
            if (num != 0) {
                result[index++] = num;
            }
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        //or
        System.out.println(Arrays.toString(result));


        //Second way: Stream API; O(n log n)
        arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));


        //Collection f/w: O(n)
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));
        int zeroCount = Collections.frequency(list, 0);
        list.removeAll(Collections.singleton(0));
        for(int i=0; i<zeroCount; i++){
            list.add(0);
        }
        System.out.println(list);

    }
}
