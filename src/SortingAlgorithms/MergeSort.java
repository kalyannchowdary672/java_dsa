package SortingAlgorithms;
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        arr = mergeSort(arr);
        System.out.print(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int lPointer = 0;
        int rPointer = 0;
        int k = 0;

        while(lPointer < first.length && rPointer < second.length ){
            if (first[lPointer] < second[rPointer]) {
                mix[k] = first[lPointer];
                lPointer++;
            }else{
                mix[k] = second[rPointer];
                rPointer++;
            }
            k++;

        }

        while(lPointer < first.length){
            mix[k] = first[lPointer];
            lPointer++;
            k++;
        }
        while(rPointer < second.length){
            mix[k] = second[rPointer];
            rPointer++;
            k++;
        }
        return mix;

    }
}
