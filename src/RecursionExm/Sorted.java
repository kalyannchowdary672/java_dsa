package RecursionExm;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print(sorted(arr,0));

    }
    static boolean sorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }else{
            return (arr[index] < arr[index + 1] && sorted(arr,index + 1));
        }
    }
}
