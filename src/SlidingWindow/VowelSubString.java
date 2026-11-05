package SlidingWindow;

public class VowelSubString {
    public static void main(String[] args) {
        class Solution {
            public int maxVowels(String s, int k) {

                int sum = 0;
                for(int i = 0; i < k; i++){
                    sum += isVowel(s.charAt(i));
                }
                int max = sum;

                int start = 0;
                int end = k;

                while(end < s.length()){
                    sum -= isVowel(s.charAt(start));
                    start++;
                    sum += isVowel(s.charAt(end));
                    end++;
                    max = Math.max(max,sum);
                }
                return max;

            }
            private int isVowel(char c){
                return switch(c) {
                    case 'a', 'e', 'i', 'o', 'u' ->  1;
                    default -> 0;
                };
            }
        }
    }
}
