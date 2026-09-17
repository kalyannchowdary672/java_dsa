package LeetcodeBinaryProblems;
import java.util.Arrays;

public class IntersectionOfArray {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            int[] ans = new int[nums2.length];
            int count = 0;

            for (int i = 0; i < nums2.length; i++) {
                int target = nums2[i];

                if (i > 0 && target == nums2[i - 1]) {
                    continue;
                }

                if (binarySearch(nums1, target)) {
                    ans[count] = target;
                    count++;
                }
            }

            int[] result = new int[count];
            for (int i = 0; i < count; i++) {
                result[i] = ans[i];
            }

            return result;
        }

        private boolean binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }

}
