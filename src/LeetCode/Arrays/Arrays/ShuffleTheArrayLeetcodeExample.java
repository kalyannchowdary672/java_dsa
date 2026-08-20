package LeetCode.Arrays.Arrays;

public class ShuffleTheArrayLeetcodeExample {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[nums.length];
            int left = 0;
            int right = n;
            for(int i = 0 ; i < nums.length ; i++){
                if( i  % 2 == 0){
                    ans[i] = nums[left];
                    left++;
                }if( i % 2 == 1){
                    ans[i]  = nums[right];
                    right++;
                }

            }
            return ans ;

        }
    }
}
