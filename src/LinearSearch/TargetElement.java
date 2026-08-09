package LinearSearch;

public class TargetElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 89, 76, 65, 98};
        int target = 98;
        int ans = LinearSearch( nums ,target);
        System.out.println(ans);
    }
    static int LinearSearch(int arr[] ,int target ){
        if( arr.length == 0 ){
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
           return -1;
    }
}
