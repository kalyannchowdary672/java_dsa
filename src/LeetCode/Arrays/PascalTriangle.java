package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

        class Solution {
            public List<List<Integer>> generate(int numRows) {
                List<List<Integer>> triangle = new ArrayList<>();

                // Base case: if no rows are requested, return empty list
                if (numRows == 0) return triangle;

                // First row is always [1]
                List<Integer> firstRow = new ArrayList<>();
                firstRow.add(1);
                triangle.add(firstRow);

                for (int i = 1; i < numRows; i++) {
                    List<Integer> prevRow = triangle.get(i - 1);
                    List<Integer> currentRow = new ArrayList<>();

                    // The first element of every row is always 1
                    currentRow.add(1);

                    // Calculate middle elements by adding adjacent elements from the previous row
                    for (int j = 1; j < i; j++) {
                        currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
                    }

                    // The last element of every row is always 1
                    currentRow.add(1);

                    // Add the fully constructed row to our triangle
                    triangle.add(currentRow);
                }

                return triangle;
            }
        }
    }
}
