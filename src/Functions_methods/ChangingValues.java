package Functions_methods;

import java.util.Arrays;

public class ChangingValues {
    public static void main(String[] args) {
        int[] arr ={ 1 , 4 ,7, 90};
        System.out.println();
        change( arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums ){
       nums[0]=99;
    }
}
