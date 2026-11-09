package SlidingWindow;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        class Solution {
            public int lengthOfLongestSubstring(String s) {
                HashMap<Character, Integer> map = new HashMap<>();
                int left = 0;
                int maxlen = 0;
                for(int right = 0; right < s.length(); right++){
                    char currChar = s.charAt(right);
                    if(map.containsKey(currChar)){
                        left = Math.max(left,map.get(currChar)+ 1);
                    }
                    map.put(currChar,right);
                    maxlen = Math.max(maxlen,right-left+1);
                }
                return maxlen;


            }
        }
    }
}
