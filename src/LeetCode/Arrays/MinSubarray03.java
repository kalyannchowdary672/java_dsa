package LeetCode.Arrays;

public class MinSubarray03 {
    public static void main(String[] args) {
        class Solution {
            public int minSubArrayLen(int target, int[] nums) {
                int min = Integer.MAX_VALUE;
                int sum = 0;
                int left = 0;
                for(int right = 0; right < nums.length; right++){
                    sum = sum + nums[right];
                    while(sum >= target){
                        min = Math.min(min,right - left + 1);
                        sum = sum - nums[left];
                        left++;
                    }
                }if(min < Integer.MAX_VALUE){
                    return min;
                }else{
                    return 0;
                }

            }
        }
    }
}
