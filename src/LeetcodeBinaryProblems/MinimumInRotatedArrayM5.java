package LeetcodeBinaryProblems;

public class MinimumInRotatedArrayM5 {
    public static void main(String[] args) {
        class Solution {
            public int findMin(int[] nums) {
                int pivot = Findpivot(nums);
                if(pivot == -1){
                    return nums[0];
                }
                return nums[pivot + 1];
            }
            // public int Bs(int[] nums, int target, int start , int end){
            //     int mid = start + (end  - start)/2;
            //     while(start < mid){
            //         if(nums[mid] == nums[target]){
            //             return mid;
            //         }if(nums[mid] > nums[mid + 1]){
            //             return mid + 1;
            //         }
            //     }
            //     return start;
            // }
            public int Findpivot(int[] nums){
                int start  = 0;
                int end = nums.length -1;
                while(start <= end){
                    int mid = start + (end - start)/2;
                    if( mid < end && nums[mid] > nums[mid + 1]){
                        return mid;
                    }if( start < mid && nums[mid] < nums[mid - 1]){
                        return mid - 1;
                    }if(nums[start] <= nums[mid]){
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
                return -1;
            }
        }
    }
}
