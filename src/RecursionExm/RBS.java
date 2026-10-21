package RecursionExm;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 54, 56, 78 ,90};
        System.out.print(search(arr, 54, 0,arr.length -1));

    }
    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid] ){
            if(target >= arr[start] && target <= arr[mid])
            return search(arr, target, start,mid -1);
        }else {
            return search(arr, target, mid + 1, end);
        }
        if( target >= arr[mid] && target <= arr[end]){
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid -1);
    }
}
