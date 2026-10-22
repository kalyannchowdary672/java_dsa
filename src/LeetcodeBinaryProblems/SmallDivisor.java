package LeetcodeBinaryProblems;

public class SmallDivisor {
    public static void main(String[] args) {
        class Solution {
            public int smallestDivisor(int[] nums, int threshold) {
                int max = nums[0];
                for(int k = 0; k < nums.length;k++){
                    if(nums[k] > max ) max = nums[k];
                }

                int low = 1;
                int high = max;

                while(low <= high){
                    int mid = low + (high - low)/2;

                    int sum = 0;
                    for(int j = 0 ; j < nums.length ;j++){
                        sum += (nums[j] + mid -1)/mid;
                    }

                    if(sum <= threshold) {
                        high = mid - 1;

                    }
                    else {
                        low = mid + 1;
                    }
                }
                return low;
            }
        }
    }
}
