package LeetCode.Arrays;

public class SumZero22 {
    class Solution {
        public int[] sumZero(int n) {
            int[] ans = new int[n];
            int start = 0;
            int end = n-1;
            int num = 1;
            while(start < end){
                ans[start] = num;
                ans[end]= -num;
                start++;
                end--;
                num++;
            }
            return ans;


        }
    }
}
