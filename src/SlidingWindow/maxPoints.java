package SlidingWindow;

public class maxPoints {
    public static void main(String[] args) {
        class Solution {
            public int maxScore(int[] cardPoints, int k) {
                int leftsum = 0;
                int rightsum = 0;
                for (int i = 0; i < k; i++) {
                    leftsum += cardPoints[i];
                }
                int max = leftsum;
                int right = cardPoints.length - 1;
                for (int left = k - 1; left >= 0; left--) {
                    leftsum -= cardPoints[left];
                    rightsum += cardPoints[right];
                    right--;
                    max = Math.max(max, leftsum + rightsum);
                }
                return max;
            }
        }
    }
}