package LeetCode.Arrays;

public class TwoSumEx21 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int left = 1; left < nums.length; left++){
                for(int right = left ;right < nums.length; right++){
                    int sum = nums[right] + nums[right - left];
                    if(sum == target){
                        return new int[]{right - left , right};
                    }
                }
            }
            return new int[]{};
        }
    }
}
