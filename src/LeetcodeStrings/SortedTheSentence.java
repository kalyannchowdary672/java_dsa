package LeetcodeStrings;

public class SortedTheSentence {
    public static void main(String[] args) {
        class Solution {
            public String sortSentence(String s) {
                String[] words = s.split(" ");
                String[] ans = new String[words.length];
                for( String word : words){
                    int num = word.charAt(word.length()-1)-'0';
                    word = word.substring(0, word.length() - 1);

                    ans[num - 1] = word;
                }
                return String.join(" ", ans);
            }
        }
    }
}
