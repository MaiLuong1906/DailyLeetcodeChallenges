package backtracking;

import java.util.Scanner;

public class TimDuongDi {
    static int n, m;
    static String s = "";

    static void Try(int i, int j){
        if(i==n && j ==m){
            System.out.println(s);
        }
        if(j+1 <= m){
            s+="R";
            Try(i, j+1);
            s = s.substring(0, s.length() - 1);
        }
        if(i+1 <= n){
            s+="D";
            Try(i+1, j);
            s = s.substring(0, s.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        Try(0,0);
    }
}
