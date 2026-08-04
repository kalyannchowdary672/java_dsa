package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9
         */
//        int[][] arr2d =new int[3][];
//         int[][] arr = {
//                 { 1 , 2 , 3}, // index 0
//                 { 4 , 5 , 6}, // index 1
//                 { 7 , 8 , 9}  // index 2  int arr[2][0] ={7,8,9} {7}
//        };

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");

                }
                System.out.println();

        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
