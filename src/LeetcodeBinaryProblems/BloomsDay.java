package LeetcodeBinaryProblems;

public class BloomsDay {

    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            long totalFlowers = (long) m * k;
            if (totalFlowers > bloomDay.length) {
                return -1;
            }

            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;

            for (int day : bloomDay) {
                low = Math.min(low, day);
                high = Math.max(high, day);
            }

            int minDays = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (canMakeBouquets(bloomDay, mid, m, k)) {
                    minDays = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return minDays;
        }

        private boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {
            int bouquets = 0;
            int consecutiveFlowers = 0;

            for (int bDay : bloomDay) {
                if (bDay <= day) {
                    consecutiveFlowers++;
                    if (consecutiveFlowers == k) {
                        bouquets++;
                        consecutiveFlowers = 0;
                    }
                } else {
                    consecutiveFlowers = 0;
                }
            }

            return bouquets >= m;
        }
    }
}
