package Functions_methods;

import java.util.Scanner;

// this is used for return type

public class SumReturn {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

    }
    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter num 1:");
        int num1 = input.nextInt();
        System.out.print("enter num 2 :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}
