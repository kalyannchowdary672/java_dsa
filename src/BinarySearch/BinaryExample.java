package BinarySearch;

public class BinaryExample {
    public static void main(String[] args) {
        int[] arr = { -8 , -7, 1, 2, 5, 7, 10, 12, 15,19 };
        int target = 12;
        int ans = BinarySearch(arr , target);
        System.out.print(ans);

    }
    //return the index
    //if not return -1
    static int  BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            //find the mid element
            int mid = start + (end - start)/2;
            if(target < arr[mid] ){
                end = mid - 1;
            }else if(target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
