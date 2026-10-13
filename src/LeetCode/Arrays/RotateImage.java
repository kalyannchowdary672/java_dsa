package LeetCode.Arrays;

public class RotateImage{
    class Solution {
        public void rotate(int[][] matrix) {
            int k = matrix.length;
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for (int i = 0; i < k; i++) {
                int left = 0;
                int right = k - 1;
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }


        }

    }

}
