package SlidingWindow;

public class Threshold {
    class Solution {
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            int sum = 0;
            for(int i = 0; i < k; i++){
                sum += arr[i];
            }
            int count = 0;
            if(sum/k >= threshold) count++;
            int start = 0;
            int end = k;

            while(end < arr.length){
                sum -= arr[start];
                start++;
                sum += arr[end];
                end++;
                if(sum/k >= threshold){
                    count++;
                }
            }
            return count;
        }
    }
}
