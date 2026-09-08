package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSortExam {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        selection(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swap(arr ,maxIndex , last);
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr , int start , int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
