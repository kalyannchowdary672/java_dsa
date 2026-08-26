package BinarySearch;

public class SplitInArray {
    public static void main(String[] args) {

    }
    static int splitArray(int[] nums , int k){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start , nums[i]);
            end = end + nums[i];
        }
        // use simple binary search when we find start and end
        while(start < end){
            // try mid is the potential ans
            int mid = start + (end - start)/2;
            // calculate the subarray we are getting for the array
            int sum = 0;
            int subArray = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    subArray++;
                } else {
                    sum = sum + num;
                }
            }
            if(subArray > k){
                start = mid + 1;
            }
            end = mid;
        }
        return end; // start == end
    }
}
