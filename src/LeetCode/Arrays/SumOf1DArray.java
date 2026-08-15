package LeetCode.Arrays;

public class SumOf1DArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            // int[] sum = nums;
            for( int i = 1;i < nums.length;i++){
                nums[i]= nums[i]+ nums[i-1];

            }
            return nums;

        }
    }
}
