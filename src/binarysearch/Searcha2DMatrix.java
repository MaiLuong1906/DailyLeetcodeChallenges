package binarysearch;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class Searcha2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < rows; i++){
            int left = 0;
            int right = col-1;
            if(matrix[i][left] > target)return false;
            if(matrix[i][right] < target) continue;
            while(left <= right){
                int mid = (left + right) /2;
                if(matrix[i][mid] < target){
                    left = mid +1;
                }
                else if(matrix[i][mid] > target){
                    right = mid - 1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        System.out.println(searchMatrix(matrix, 15));
    }
}
