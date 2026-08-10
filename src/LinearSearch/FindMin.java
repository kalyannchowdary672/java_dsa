package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = { 7 , 8 , 76, 2 , 4, 1 , 90};
        System.out.print(min(arr));
    }
    static int min(int arr[]) {
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index] < min ){
                min = arr[index];
            }
        }return min;
    }
}
