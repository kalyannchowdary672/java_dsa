package LeetcodeStrings;

public class BeautySubString {
    public static void main(String[] args) {
        class Solution {
            public int beautySum(String s) {
                int beauty = 0;
                for(int i = 0; i < s.length(); i++){
                    int[] freq = new int[26];
                    for(int j = i; j < s.length(); j++){
                        freq[s.charAt(j) - 'a']++;
                        int max = 0;
                        int min = Integer.MAX_VALUE;

                        for(int k = 0; k < freq.length; k++){
                            if(freq[k] >0){
                                max= Math.max(max,freq[k]);
                                min= Math.min(min,freq[k]);
                            }
                        }
                        beauty += (max-min);
                    }
                }


                return beauty;
            }
        }
    }
}
