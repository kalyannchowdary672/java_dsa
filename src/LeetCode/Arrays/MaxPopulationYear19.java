package LeetCode.Arrays;

public class MaxPopulationYear19 {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int max = 0;
            int ans = 0;
            for(int year = 1950 ; year <= 2050 ; year++){
                int count = 0;
                for(int i = 0 ; i < logs.length; i++){
                    if( logs[i][0] <= year && logs[i][1] > year){
                        count++;
                    }
                }
                if(count > max){
                    max = count;
                    ans = year;
                }


            }
            return ans;
        }
    }
}
