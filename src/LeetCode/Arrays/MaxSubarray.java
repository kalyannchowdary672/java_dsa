package LeetCode.Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
        class Solution {
            public int maxSubArray(int[] nums){
                int maxsum = Integer.MIN_VALUE;
                int currentsum =0;
                for(int i = 0; i < nums.length; i++){
                    currentsum=currentsum+nums[i];
                    maxsum = Math.max(currentsum,maxsum);
                    if(currentsum < 0){
                        currentsum = 0;
                    }
                }

                return maxsum;
            }
        }
    }
}
