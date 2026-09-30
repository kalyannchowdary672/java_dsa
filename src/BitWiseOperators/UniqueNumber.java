package BitWiseOperators;
public class UniqueNumber {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 4,4,6, 5, 5};
        System.out.print(ans(arr));
    }
    static int ans(int[] arr) {
        int Unique = 0;
        for (int i = 0; i < arr.length; i++) {
            Unique ^= arr[i];
        }
        return Unique;
    }
}
