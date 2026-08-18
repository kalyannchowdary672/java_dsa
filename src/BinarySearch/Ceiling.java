package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 9, 10, 33, 56, 78, 80};
        int target = 34;
        int ans = Ceiling(arr, target);
        System.out.print(ans);
    }
// here ceiling means smallest number >= target
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isASc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isASc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}