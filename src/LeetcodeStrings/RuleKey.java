package LeetcodeStrings;
import java.util.List;

public class RuleKey {
    public static void main(String[] args) {
        class Solution {
            public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
                int index = 0;
                int count = 0;
                if(ruleKey.equals("type")){
                    index = 1;
                }else if(ruleKey.equals("color")){
                    index = 2;
                }else{
                    index = 3;
                }
                for(int i = 0; i < items.size();i++){
                    if(items.get(i).get(index-1).equals(ruleValue)){
                        count++;
                    }
                }
                return count;
            }
        }
    }
}
