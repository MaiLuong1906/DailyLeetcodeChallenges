package backtracking;

import java.util.Scanner;

public class SinhToHop {
    static int[] x = new int[100];
    static int n, k;

    public static void Try(int i){
        for(int j = x[i-1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                print();
            }
            else{
                Try(i+1);
            }
        }
    }

    public static void print() {
        if (k == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 1; i <= k; i++) {
            System.out.print(x[i]);
            if (i < k) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x[0] = 0;
        for (k = 0; k <= n; k++) {
            if (k == 0) {
                print();
            } else {
                Try(1);
            }
        }
    }


}
