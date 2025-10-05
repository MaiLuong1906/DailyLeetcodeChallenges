package twopointer;

import java.util.Arrays;

public class TwoIntegerSumII {

//    // Cach 1
//    public static int[] twoSum(int[] numbers, int target) {
//        int n = numbers.length;
//        int slow = 0;
//        while(slow < n - 1){
//            int fast = slow+1;
//            int diff = target - numbers[slow];
//            while( fast < n){
//                if(numbers[fast] == diff){
//                    return new int[]{slow+1, fast+1};
//                }
//                fast++;
//            }
//            slow++;
//        }
//        return new int[]{};
//    }

    //Cach 2:
    public static int[] twoSum(int[] numbers, int target){
        int l = 0, r = numbers.length -1;
        while(l < r){
            int tmp = numbers[l] + numbers[r];

            if(target > tmp) l++;
            else if(target < tmp) r--;
            else return new int[]{l+1, r+1};
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(twoSum(a, 7)));
    }
}
