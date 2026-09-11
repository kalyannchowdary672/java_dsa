package LeetcodeSortingAlgorithms;

public class MissingNoInArr {
    class Solution {
        public int missingNumber(int[] nums) {
            int i = 0;
            while(i < nums.length){
                int check = nums[i];
                if(nums[i] < nums.length && nums[i] != nums[check]){
                    swap(nums , i , check);
                }else{
                    i++;
                }
            }
            for( int index = 0 ; index < nums.length ; index++){
                if(nums[index]  != index){
                    return index;
                }
            }
            return nums.length;


        }
        static void swap(int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
}
