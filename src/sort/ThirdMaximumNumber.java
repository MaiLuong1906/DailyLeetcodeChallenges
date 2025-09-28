package sort;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums){

        long[] maxArr= new long[]{Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for(int i = 0; i < nums.length; i++){
            insertion(maxArr, nums[i]);
        }

        if(maxArr[2] == Long.MIN_VALUE) return (int)maxArr[0];
        return (int)maxArr[2];
    }

    public static void insertion(long[] maxArr, int val){

        int i = 0;
        while(i < maxArr.length){
            if(maxArr[i] == val) return;
            else if(maxArr[i] > val) i++;
            else break;
        }

        if(i < maxArr.length){
            for(int j = maxArr.length -2; j >= i; j--){
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1};
        System.out.println(thirdMax(a));
    }
}
