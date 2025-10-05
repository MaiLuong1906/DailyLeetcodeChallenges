package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
//    // Cach 1
//    public static boolean hasDuplicate(int[] nums){
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i] == nums[j]) return true;
//            }
//        }
//        return false;
//    }

//    // Cach 2
//    public static boolean hasDuplicate(int[] nums){
//        int n = nums.length;
//        sort(nums, 0, n-1);
//        for(int i = 1; i < n; i++){
//            if(nums[i] == nums[i-1])
//                return true;
//        }
//        return false;
//    }
//
//    public static void sort(int[] a, int left, int right){
//        if(left >= right) return;
//
//        int mid = (left + right) /2;
//
//        int pivot = partition(a, left, right, a[mid]);
//
//        sort(a, left, pivot -1);
//        sort(a, pivot, right);
//    }
//
//    public static int partition(int[] a, int left, int right, int key){
//        int iL = left;
//        int iR = right;
//
//        while(iL <= iR){
//            while(a[iL] < key) iL++;
//            while(a[iR] > key) iR--;
//            if(iL <= iR){
//                int tmp = a[iL];
//                a[iL] = a[iR];
//                a[iR] = tmp;
//                iL++; iR--;
//            }
//        }
//        return iL;
//    }

    // Cach 3
    public static boolean hasDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,2};
        System.out.println(hasDuplicate(a));
    }

}
