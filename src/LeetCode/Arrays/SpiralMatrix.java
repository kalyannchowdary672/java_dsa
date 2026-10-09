package LeetCode.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        class Solution {
            public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> result = new ArrayList<>();
                if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
                    return result;
                }
                int top = 0;
                int bottom = matrix.length-1;
                int left = 0;
                int right = matrix[0].length -1;

                while(top <= bottom && left <= right){
                    for(int i = left; i <= right;i++ ){
                        result.add(matrix[top][i]);
                    }
                    top++;
                    for(int j = top ; j <= bottom; j++){
                        result.add(matrix[j][right]);
                    }
                    right--;
                    if(top <= bottom){
                        for(int i = right; i >= left;i--){
                            result.add(matrix[bottom][i]);
                        }
                        bottom--;
                    }

                    if(left <= right){
                        for(int j = bottom; j >= top; j--){
                            result.add(matrix[j][left]);
                        }
                        left++;
                    }


                }
                return result;



            }
        }
    }
}
