package LeetCode.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        class Solution {
            public int removeElement(int[] nums, int val) {

                int k = 0; // Pointer for the position of the next valid element

                for (int i = 0; i < nums.length; i++) {
                    // If the current element is not the target value, keep it
                    if (nums[i] != val) {
                        nums[k] = nums[i];
                        k++;
                    }
                }

                return k; // Return the number of elements not equal to val
            }
        }

    }
}
