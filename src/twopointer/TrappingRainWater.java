package twopointer;

public class TrappingRainWater {
    public static int trap(int[] height){
        int n = height.length;
        int res = 0;
        int i = 0;
        while(i < n){
            if(height[i] ==0) i++;
            else{
                int h = height[i];
                i++;
                if(h <= height[i]){
                    i++;
                }
                else{
                    int w = 0;
                    int tmp = 0;
                    while(i < n && h < height[i]){
                        tmp -= height[i];
                        w++;
                        i++;
                    }
                    if(i < n){
                        tmp += w*h;

                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,2};
        System.out.println(trap(a));
    }
}
