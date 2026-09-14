package LeetCode.Arrays;

public class ReturnThirdLargest {
    class Solution {
        public int thirdMax(int[] nums) {
            long max = Long.MIN_VALUE;
            long secondMax = Long.MIN_VALUE;
            long thirdMax = Long.MIN_VALUE;
            for(int i = 0; i < nums.length ;i++){
                if(nums[i] == max || nums[i] == secondMax || nums[i] == thirdMax){
                    continue;
                }
                if(nums[i] > max){
                    thirdMax = secondMax;
                    secondMax = max;
                    max = nums[i];
                }else if( nums[i] > secondMax){
                    thirdMax = secondMax;
                    secondMax = nums[i];
                }else if(nums[i] > thirdMax){
                    thirdMax = nums[i];
                }
            }
            if(thirdMax == Long.MIN_VALUE){
                return(int) max;
            }
            return(int) thirdMax;
        }
    }
}
