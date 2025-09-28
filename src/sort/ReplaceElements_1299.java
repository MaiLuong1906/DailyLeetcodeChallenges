package sort;

import java.util.Arrays;

public class ReplaceElements_1299 {

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] rs = new int[n];
        int maxArr = -1;
        for(int i = n-1; i >= 0; i--){
            rs[i] = maxArr;
            if(arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
