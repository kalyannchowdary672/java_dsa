package Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1 , 98 , 96 , 64 ,5};
        System.out.println(maxRange(arr ,1,4));
    }
    static int maxRange(int[] arr , int start , int end){
        int maxval  = arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }

        return maxval;
    }
    static int max(int[] arr){
        int maxval  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxval){
              maxval = arr[i];
            }
        }

        return maxval;
    }
}
