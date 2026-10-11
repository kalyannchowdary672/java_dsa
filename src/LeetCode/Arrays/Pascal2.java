package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascal2 {
    public static void main(String[] args) {
        class Solution {
            public List<Integer> getRow(int rowIndex) {
                List<Integer> ans = new ArrayList<>();
                long current = 1;
                ans.add((int)current);

                for(int i  = 1; i <= rowIndex; i++ ){
                    current = current * (rowIndex - i + 1 )/i;
                    ans.add((int)current);

                }
                return ans;

            }
        }
    }
}
