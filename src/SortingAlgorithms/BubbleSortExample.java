package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main() {
        int[] arr = {1, 3, 4, 2, 5};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
static void bubble(int[] arr){
    Boolean swapped;
    //run loop steps for n-1 time
    for (int i = 0; i < arr.length; i++) {
        // run second loop to get maximum element
        swapped = false;
        for (int j = 1; j < arr.length - 1; j++) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                swapped = true;

            }
        }
            if (!swapped) {
                break;
            }
        }
    }
}