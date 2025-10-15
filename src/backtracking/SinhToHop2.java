package backtracking;

import java.util.Scanner;

public class SinhToHop2 {
    static int n,k;
    static int[] x = new int[100];

    static void print(){
        System.out.print("[");
        for (int i = 1; i <= k; i++) {
            System.out.print(x[i]);
            if (i < k) System.out.print(", ");
        }
        System.out.println("]");
    }

    static void Try(int i){
        for(int j = x[i-1]+1; j <= n - k + i; j++){
            x[i] = j;

            if(i == k){
                print();
            }
            else Try(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        x[0] = 0;
        Try(1);
    }
}
