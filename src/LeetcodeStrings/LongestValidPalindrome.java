package LeetcodeStrings;

public class LongestValidPalindrome {
    public static void main(String[] args) {
        class Solution {
            public String longestPalindrome(String s) {
                if(s == null|| s.length() < 1) return "";

                int start = 0;
                int end = 0;

                for(int i = 0; i < s.length(); i++){

                    int odd = subSequence(s,i,i);
                    int even = subSequence(s,i,i+1);

                    int max = Math.max(odd,even);

                    if(max > end - start){
                        start = i - (max -1)/2;
                        end = i + max/2;
                    }
                }
                return s.substring(start, end + 1);

            }
            public int subSequence(String s, int left, int right){
                while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }
                return right - left - 1;
            }

        }
    }
}
