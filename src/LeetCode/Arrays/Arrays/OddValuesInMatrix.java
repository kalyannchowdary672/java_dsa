package LeetCode.Arrays.Arrays;

public class OddValuesInMatrix {
    class Solution {
        public int oddCells(int m, int n, int[][] indices) {
            int[][] matrix = new int[m][n];
            for(int k = 0; k < indices.length ; k++){
                int row = indices[k][0];
                int column = indices[k][1];
                for(int j = 0 ; j < n ; j++){
                    matrix[row][j]++;
                }
                for(int i = 0 ; i < m ; i++){
                    matrix[i][column]++;
                }

            }
            int count = 0;
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    if(matrix[i][j] % 2 == 1){
                        count++;
                    }
                }

            }
            return count;

        }
    }
}
