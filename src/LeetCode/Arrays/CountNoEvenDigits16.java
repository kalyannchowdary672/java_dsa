package LeetCode.Arrays;

public class CountNoEvenDigits16 {
    public int findNumbers(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int digitcount = 0;
                while (nums[i] > 0) {
                    nums[i] = nums[i] / 10;
                    digitcount++;
                }
                if (digitcount % 2 == 0) {
                    count++;
                }
            }
            return count;
    }
}