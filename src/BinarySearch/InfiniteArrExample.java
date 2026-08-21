package BinarySearch;

public class InfiniteArrExample {
    public static void main(String[] args) {
        int[] arr = {19, 28, 39, 45, 67, 129, 245, 678, 789, 2345};
        int target = 129;
        System.out.print(ans(arr , target));

    }
    static int ans(int[] arr, int target) {
        // first find the range and and take size is 2
        int start = 0;
        int end = 1;
        //double the size of array every time when target not found
        while (target > arr[end]) {
            int newStart = end + 1;
            //size of the array is  end : previous end + size of box * 2
            end = end + (end - start) * 2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);

    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //calculate mid for the given array
            int mid = start + (end - start) / 2;
            //if target is greater than the mid element
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

