package Arrays;

import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
        int[] num = {2 , 8 ,9, 0};
        System.out.println(Arrays.toString(num));
        Change(num);
        System.out.println(Arrays.toString(num));

    }
    static void Change(int[] arr) {
        arr[0] = 99;

    }

}
