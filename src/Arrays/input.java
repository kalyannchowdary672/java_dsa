package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // arrays for primitives
          int[] arr = new int[4];
          arr[0]= 234;
          arr[1]= 7;
          arr[2]= 10;
          arr[3]= 45;
        System.out.println(arr[0]);

        // arrays by using for loops
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] =in.nextInt();
//         }
//          System.out.print(Arrays.toString(arr));

//       by taking input

//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//
//            }

        // arrays for objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // to modify
        str[3]= "kalyan";
        System.out.println(Arrays.toString(str));


    }
}
