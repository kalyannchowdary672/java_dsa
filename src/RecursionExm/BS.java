package RecursionExm;

public class BS {
    public static void main(String[] args) {
        int[] arr = { 6, 7 , 8 ,9,11, 25, 67, 89};
        int target = 25;
        System.out.print(search(arr,target,0,arr.length - 1));
    }
    static int search(int[] arr, int target, int s , int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }if(arr[m] > target){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m + 1,e);
    }
}
