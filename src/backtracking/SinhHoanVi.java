package backtracking;

import java.util.Scanner;

public class SinhHoanVi {
    public static void Try(int[] a,int i, int n){
        for(int j = 0; j < n; j++){
            a[i] = j;
            if(i == n -1){
                in(a, n);
            }
            else{
                Try(a,i+1, n);
            }
        }
    }

    public static void in(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Try(a, 0, n);
    }
}
