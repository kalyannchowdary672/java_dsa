package LeetcodeBinaryProblems;

public class GuessNoIsHigherOrLower {
//    /**
//     * Forward declaration of guess API.
//     * @param  num   your guess
//     * @return 	     -1 if num is higher than the picked number
//     *			      1 if num is lower than the picked number
//     *               otherwise return 0
//     * int guess(int num);
//     */


        public int guessNumber(int n) {
            int start = 0;
            int end = n;
            int ans = 0;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                ans = (mid);
                if (ans == 0) {
                    return mid;
                } else if (ans == -1) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            return ans;

        }

    }



