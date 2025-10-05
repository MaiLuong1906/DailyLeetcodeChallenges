package binarysearch;

public class FindMinimum {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1, mid;
        while(l < r){
            mid = (l+r)/2;
            if(nums[mid] < nums[r]){
                r = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,6,1,2};
        System.out.println(findMin(nums));
    }
}
