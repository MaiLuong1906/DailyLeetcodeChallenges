package search;

import java.util.Random;

public class GuessNumber {
    public static int guess(int num) {
        Random random = new Random();
        int pick = random.nextInt(1000);
        if (num == pick) return 0;
        if (num > pick) return -1;
        return 1;
    }

    public static int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int res = guess(mid);

            if (res == 0) return mid;
            else if (res < 0) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    // Demo
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Số bí mật là: " + guessNumber(n));
    }
}
