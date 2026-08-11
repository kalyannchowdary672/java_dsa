package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr ={
                {7 ,3, 6, 98},
                {87, 65 , 2},
                {9, 78 , 55, 64}
        };
        int target =  78;
        int[] ans = search(arr , target);
        System.out.print(Arrays.toString(ans) );

    }
    static int[] search( int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }

            }

        } return new int[]{-1,-1};
    }
}
