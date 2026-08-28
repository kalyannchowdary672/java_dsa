package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ans =new ArrayList<>();
            int LargestElement = 0;
            for(int n = 0 ; n < candies.length ; n++){
                if(candies[n] > LargestElement){
                    LargestElement = candies[n];
                }
            }
            for(int i = 0 ; i < candies.length  ; i++ ){
                if((candies[i] + extraCandies) >= LargestElement){
                    ans.add(true);
                }else{
                    ans.add(false);
                }
            }
            return ans;
        }
    }
}
