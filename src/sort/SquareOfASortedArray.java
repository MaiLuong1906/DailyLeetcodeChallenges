package sort;

import java.util.Arrays;

public class SquareOfASortedArray {
    public static void insertionSort(int[] a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            int tmp = a[i];
            int j = i - 1;
            while(j >=0 && a[j] > tmp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = tmp;
        }
    }

    public static int[] squareOfASortedArray(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] *= a[i];
        }
        insertionSort(a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOfASortedArray(new int[]{-4,-1,0,3,10})));
    }
}
