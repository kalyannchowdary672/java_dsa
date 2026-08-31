package LeetcodeBinaryProblems;

public class ArrangingCoins6 {
    class Solution {
        public int arrangeCoins(int n) {
            int row = 1;
            while(n >= row){
                n = n - row;
                row++;
            }
            return row - 1;
        }
    }
}
