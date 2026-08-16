package BinarySearch;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-8, -7, 5, 8, 12, 18 , 29 , 30};
        int target = 12;
        int ans = OrderAgnostic(arr, target);
        System.out.print(ans);
    }
    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start) + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

            }

        }
        return -1;
    }
}



