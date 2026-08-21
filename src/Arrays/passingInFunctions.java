package Arrays;

import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
        int[] num = {2 , 8 ,9, 0};
        System.out.print(Arrays.toString(num));
        Change(num);
        System.out.print(Arrays.toString(num));

    }
    static void Change(int[] arr) {
        arr[0] = 99;

    }

}
