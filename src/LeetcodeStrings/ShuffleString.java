package LeetcodeStrings;

public class ShuffleString {
    public static void main(String[] args) {
        class Solution {
            public String restoreString(String s, int[] indices) {
                char[] result = new char[s.length()];
                for(int i = 0; i < s.length(); i++){
                    result[indices[i]] = s.charAt(i);
                }
                return new String(result);

            }
        }
    }
}
