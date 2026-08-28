package LeetCode.Arrays;

public class DiagonalSumInMatrix15 {class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        // for row
        for(int i = 0 ; i < mat.length ; i++){
            sum = sum + mat[i][i];
            sum = sum + mat[i][mat.length -i -1];
        }
        if(mat.length % 2 != 0){
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }


}
}
