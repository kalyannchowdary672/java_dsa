package LeetCode.Arrays;

import java.util.HashMap;

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
    // hashing technique
    class Solutions {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i < nums.length;i++){
                int sum= target - nums[i];

                if(map.containsKey(sum)){
                    return new int[]{map.get(sum),i};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
}
