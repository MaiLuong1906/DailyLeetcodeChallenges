package sort;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int n = nums.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(j != i) nums[i] = 0;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1};
        System.out.println(Arrays.toString(a));
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
