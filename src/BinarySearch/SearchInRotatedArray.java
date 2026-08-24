package BinarySearch;

public class SearchInRotatedArray {
    class Solution {
        public int search(int[] nums, int target) {
            int pivot = FindPivot(nums);
            // if pivot is not found means the array is not rotated
            if(pivot == -1){
                //simply return binary search
                return binarySearch(nums, target, 0 , nums.length-1);
            }
            //if pivot is found you have two 2 asc sorted
            if(nums[pivot]== target ){
                return pivot;
            }if(target >= nums[0]){
                return binarySearch(nums, target , 0, pivot - 1);

            }if(target <= nums[0]){
                return binarySearch(nums, target , pivot + 1 , nums.length-1 );
            }
            return -1;
        }
        int binarySearch(int[] nums , int target, int start , int end){
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target == nums[mid]){
                    return mid;
                }
                if(target < nums[mid]){
                    end = mid - 1;
                }if(target > nums[mid]){
                    start = mid + 1;
                }
            }
            return -1;

        }
        int FindPivot(int[] nums){
            int start = 0;
            int end = nums.length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(mid < end && nums[mid] > nums[mid + 1]){
                    return mid;
                }
                if(mid > start && nums[mid] < nums[mid - 1]){
                    return mid - 1;
                }
                if(nums[start] >= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return -1;

        }
    }
}
