package LeetcodeSortingAlgorithms;

public class FindDuplicate {
    class Solution {
        public int findDuplicate(int[] nums) {
            int index = 0;
            while (index < nums.length) {
                if (nums[index] != index + 1) {
                    int correct = nums[index] - 1;
                    if (nums[index] != nums[correct]) {
                        swap(nums, index, correct);
                    } else {
                        return nums[index];
                    }
                } else {
                    index++;
                }
            }
            return -1;
        }
        static void swap(int[] nums, int first, int second) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
}
