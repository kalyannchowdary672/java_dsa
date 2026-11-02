package LeetcodeSortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {

    }
    static void sort( int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

        }

    }
}
