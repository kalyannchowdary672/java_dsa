package LeetCode.Arrays;

public class MaxSubArrayK {
    public static void main(String[] args) {
        class Solution {
            public double findMaxAverage(int[] nums, int k) {
                int maxSum = Integer.MIN_VALUE;
                int runningsum = 0;
                int left = 0;
                for (int right = 0; right < nums.length; right++) {
                    runningsum += nums[right];
                    if (right - left == k) {
                        runningsum -= nums[left];
                        left++;
                    }
                    if (right - left + 1 == k) {
                        maxSum = Math.max(runningsum, maxSum);
                    }
                }
                return (double) maxSum / k;

            }
        }
    }
}
