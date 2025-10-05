package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    // Cach 1:
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i]+nums[j]== target) return new int[]{i, j};
//            }
//        }
//        return new int[]{0};
//    }

    //Cach2:
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> check = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(check.containsKey(diff)){
                return new int[]{check.get(diff),i};
            }
            check.put(num,i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,5};
        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }
}
