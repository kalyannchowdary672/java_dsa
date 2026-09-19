package LeetCode.Arrays;

import java.util.ArrayList;

public class MoveZeros {
    // this is the brute force approach
    class  Solution {
        public void moveZeroes(int[] nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    temp.add(nums[i]);
                }
            }
            for(int j = 0; j < temp.size(); j++ ){
                nums[j] = temp.get(j);
            }
            int nonzero = temp.size();
            for(int i = nonzero; i < nums.length; i++){
                nums[i] = 0;
            }
        }
    }
   // this is the optimal solution
    class zeros {
        public void moveZeroes(int[] nums) {
            int i = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] != 0){
                    Swap(nums,j,i);
                    i++;
                }
            }
        }
        public void Swap(int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

    }
}
