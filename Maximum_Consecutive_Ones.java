package EveryDay75;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1,1,1,1,0,0,1,1,1 };

        //first way without using in-built method
        int count = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                count += 1;
                continue;
            }
            if(sum < count){
                sum = count;
                count = 0;
            }
        }
        if(sum < count){
            System.out.println("Maximum_Consecutive_Ones: "+count);
        }else {
            System.out.println("Maximum_Consecutive_Ones: "+sum);
        }

    }
}
