package LeetCode.Arrays;

public class MaxProductSubArr {
    public static void main(String[] args) {
        class Solution {
            public int maxProduct(int[] nums) {
                int max = Integer.MIN_VALUE;

                int prefix = 1;
                int suffix = 1;

                for(int i = 0 ; i < nums.length ;i++){
                    if(prefix == 0){
                        prefix = 1;
                    }if(suffix == 0){
                        suffix = 1;
                    }
                    prefix = prefix * nums[i];
                    suffix = suffix * nums[nums.length - i - 1];

                    if(prefix > max){
                        max = prefix;
                    }if(suffix > max){
                        max = suffix;
                    }
                }
                return max;

            }

        }
    }
}
