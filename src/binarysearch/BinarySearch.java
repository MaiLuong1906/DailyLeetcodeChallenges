package binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = (left + right) /2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,2,4,6,8};
        System.out.println(search(nums, 4));
    }
}
