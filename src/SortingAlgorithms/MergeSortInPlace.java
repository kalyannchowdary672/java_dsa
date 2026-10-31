package SortingAlgorithms;
import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,11,6};
        mergeInPlace(arr,0, arr.length);
        System.out.print(Arrays.toString(arr));

    }
    static void mergeInPlace(int[] arr, int start , int end){

        if(end - start == 1) return;
        int mid = (start + end) /2;
        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid , end);

        mergesort(arr, start, mid, end);
    }
    static void mergesort(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] =  arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0;l < mix.length;l++){
            arr[start + l] = mix[l];
        }

    }
}
