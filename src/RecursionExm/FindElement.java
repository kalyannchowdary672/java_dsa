package RecursionExm;

import Arrays.ArrayListExample;

import java.util.ArrayList;
import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1,3, 5,5, 6,8};
        System.out.print(findAllIndex2(arr, 5, 0));

    }
    static boolean Search(int[] arr , int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }static int Find( int[] arr, int target, int index){
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return Find(arr, target, index + 1);
        }
    }static ArrayList findAllIndex(int[] arr, int target, int index ,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex( arr, target, index + 1,list);

    }
    static ArrayList findAllIndex2(int[] arr, int target, int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> belowFunCalls = findAllIndex2( arr, target, index + 1);
        list.addAll(belowFunCalls);
        return list;

    }
}
