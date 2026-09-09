package LeetCode.Arrays;

public class RotationArrOfMatrix20 {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            for(int rotation = 0 ; rotation < 4 ; rotation++){
                boolean same = true;

                for(int i = 0 ; i < mat.length ;i++){
                    for(int j = 0; j < mat.length ; j++){
                        if(mat[i][j] != target[i][j]){
                            same = false;
                        }
                    }
                }
                if(same){
                    return true;
                }
                for(int i = 0; i < mat.length; i++){
                    for(int j = i+1; j < mat.length ; j++){
                        int temp = mat[i][j];
                        mat[i][j] = mat[j][i];
                        mat[j][i] = temp;

                    }
                }
                for(int i = 0; i < mat.length; i++ ){
                    int start = 0;
                    int end = mat.length - 1;
                    while(start < end){
                        int temp = mat[i][start];
                        mat[i][start] = mat[i][end];
                        mat[i][end] = temp;
                        start++;
                        end--;
                    }
                }
            }
            return false;
        }
    }
}
