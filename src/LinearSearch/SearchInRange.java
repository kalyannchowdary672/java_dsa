package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = { 23 , 56, 7, 8, 9, 78 , 76};
        int target = 9 ;
        System.out.print(range( arr,target,1,4));

    }
    static int range(int arr[] ,int target , int start ,int end){
        if( arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
