package sort;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static int heightChecker(int[] a){
        int n = a.length;
        int[] rs = new int[n];
        for(int i = 0; i < n; i++){
            rs[i] = a[i];
        }
        int count = 0;
        bubbleSort(rs);
        for(int i = 0; i < a.length; i++){
            if(a[i] != rs[i])count++;
        }
        return count;
    }
    public static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    flag = true;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            if(!flag)break;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,4,2,1,3};
        heightChecker(a);
    }
}
