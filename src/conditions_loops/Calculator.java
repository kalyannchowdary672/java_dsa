package conditions_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //give a input from the user until he does not press 'x' or 'x'

        int ans = 0;
        while (true) {
            // take operator as input
            System.out.print("enter the operation:");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // input two numbers
                System.out.print("enter  two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();


                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

                }else if (op == 'X' || op == 'x') {
                    break;
                } else {
                    System.out.println("~invalid operation");
                }

            System.out.println(ans);
        }

    }
}
