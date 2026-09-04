package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger{
    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k){
            List<Integer> ans = new ArrayList<>();
            int leftpointer = num.length - 1;
            int carry = 0;
            while(leftpointer >= 0 || k > 0){
                int sum = carry;
                if(leftpointer >= 0){
                    sum += num[leftpointer];
                    leftpointer--;
                }if(k > 0){
                    sum += k % 10;
                    k /= 10;
                }
                ans.add(sum % 10);
                carry = sum/10;
            }
            if(carry > 0){
                ans.add(carry);
            }
            Collections.reverse(ans);
            return ans;
        }
    }
}
