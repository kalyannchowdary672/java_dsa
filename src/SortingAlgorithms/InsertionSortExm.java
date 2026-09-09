package SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class InsertionSortExm {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        insertion(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
        for(int i = 0 ; i < arr.length -1 ; i++ ){
            for (int j = i + 1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j , j-1);
                }else{
                    break;
                }
            }
        }
    }
}
