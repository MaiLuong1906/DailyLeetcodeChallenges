package twopointer;

public class ContainerWithMostWater {
    public static int maxArea(int[] heights) {
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        while(l < r){
            int h = Math.min(heights[l], heights[r]);
            res = Math.max(res, h*(r-l));
            if(heights[l] < heights[r]) l++;
            else r--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }
}
