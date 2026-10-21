package RecursionExm;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1,3, 5, 6,8};
        System.out.println(Find(arr,8, 0));

    }
    static boolean Search(int[] arr , int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }static int Find( int[] arr, int target, int index){
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return Find(arr, target, index + 1);
        }
    }
}
