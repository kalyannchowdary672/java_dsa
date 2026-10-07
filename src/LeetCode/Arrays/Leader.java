package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    public static void main(String[] args) {
        int[] nums = {10,22, 12, 3,0,6};
        System.out.print(findLeaders(nums));
    }
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            boolean leader = true;
            for(int j = i+1; j < nums.length;j++){
                if(nums[j] > nums[i]){
                    leader = false;
                    break;
                }
            }
            if(leader == true){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
