package sort;

import java.util.Arrays;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        int i = 1, j =1;
        while(j < n){
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }



    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
