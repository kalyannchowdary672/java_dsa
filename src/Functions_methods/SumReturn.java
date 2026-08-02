package Functions_methods;

import java.lang.String;
import java.util.Scanner;

// this is used for return type

public class SumReturn {

    public static void main(String[] args) {

        int ans = sum2(10,20);
        System.out.println(ans);
    }
    // providing arguments
    static int sum2(int a,int b){
       int sum= a + b;
       return sum;

    }
    //without arguments
    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter num 1:");
        int num1 = input.nextInt();
        System.out.print("enter num 2 :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum:"+sum);
        return sum; // if we type anything after return sth it gives error that will never execute

    }
}
