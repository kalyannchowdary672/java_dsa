package LeetCode.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        class Solution {
            public int majorityElement(int[] nums) {
                int count = 0;
                int element = 0;
                for(int i = 0; i < nums.length; i++){
                    int num = nums[i];

                    if(count == 0){
                        element =  num;
                    }if(num == element){
                        count++;
                    }else{
                        count--;
                    }
                }
                return element;
            }
        }
    }
}
