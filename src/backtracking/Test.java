package backtracking;

public class Test {
    static int[] x = new int[100];
    static int n = 4, count = 0;

    public static void in(){
        for(int i = 0; i < n; i++){
            System.out.print(x[i]);
        }
        System.out.println();
    }

    public static void Try(int i){
        count++;
        for(int j = 0; j <= 1; j++){
            x[i] = j;
            if(i == n - 1){
                in();
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Try(0);
        System.out.println(count);
    }
}
