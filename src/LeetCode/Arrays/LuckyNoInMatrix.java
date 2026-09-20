package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNoInMatrix {
    class Solution {
        public List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    boolean rowMin = true;
                    for (int k = 0; k < matrix[i].length; k++) {
                        if (matrix[i][k] < matrix[i][j]) {
                            rowMin = false;
                            break;
                        }
                    }
                    if (rowMin) {
                        boolean colMax = true;
                        for (int k = 0; k < matrix.length; k++) {
                            if (matrix[k][j] > matrix[i][j]) {
                                colMax = false;
                                break;

                            }

                        }
                        if (colMax) {
                            list.add(matrix[i][j]);
                        }

                    }

                }

            }
            return list;
        }
    }
}
