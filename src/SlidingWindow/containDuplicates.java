package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class containDuplicates {
    public static void main(String[] args) {


        class Solution {
            public boolean containsNearbyDuplicate(int[] nums, int k) {
                Set<Integer> window = new HashSet<>();

                for (int i = 0; i < nums.length; i++) {
                    // If add() returns false, the element is already in the current window
                    if (!window.add(nums[i])) {
                        return true;
                    }

                    // Maintain window size of at most k
                    if (window.size() > k) {
                        window.remove(nums[i - k]);
                    }
                }

                return false;
            }
        }



    }
}
