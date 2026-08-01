package Functions_methods;

import java.lang.String;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {


        /*
        return_type name(arguments) {
        //do sth
        return statement;
         */
        //for not return type

        sum();  // void means don't want to return anything
        sum(); // we use this method to print as many times u want without  repeating every single line of code
    }          // here i called sum 2 times without actually using the code again and again

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter num 1:");
        int num1 = input.nextInt();
        System.out.print("enter num 2 :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

    }

}

