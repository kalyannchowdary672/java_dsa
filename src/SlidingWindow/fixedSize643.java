package SlidingWindow;

public class fixedSize643 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int sum = 0;
            for(int i = 0; i < k; i++){
                sum += nums[i];
            }
            int max = sum;

            int start = 0;
            int end  = k;

            while(end < nums.length){
                sum -= nums[start];
                start++;
                sum += nums[end];
                end++;
                max = Math.max(max,sum);
            }
            return (double) max/k;


        }
    }
}
