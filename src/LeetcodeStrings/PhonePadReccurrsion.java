package LeetcodeStrings;

import java.util.ArrayList;
import java.util.List;

public class PhonePadReccurrsion {
    class Solution {
        public static final String[] KEYS = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.isEmpty()) {
                return new ArrayList<>();
            }
            return map("",digits);
        }
        public List<String> map(String dul, String org){
            if(org.isEmpty()){
                List<String> result = new ArrayList<>();
                result.add(dul);
                return result;
            }
            int digit = org.charAt(0) - '0';
            String letters = KEYS[digit];
            List<String> list = new ArrayList<>();
            for(char ch: letters.toCharArray()){
                list.addAll(map(dul + ch, org.substring(1)));
            }
            return list;
        }
    }
}
