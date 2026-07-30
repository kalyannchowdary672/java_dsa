package conditions_loops;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        /*
          syntax of for loop
          for(initialisation;condition;increment or decrement);
          do sth
                         */
        // print numbers 1 to 5
//        for (int i = 1; i <= 5 ; i++ ) {
//            System.out.println(i);
//        }
//
//        // print  hello world five times
//        for (int num = 1; num <= 5; num++) {
//            System.out.println("hello world");
            
        // providing inputs 

//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int num = 1;num <= 10; num++) {
//            System.out.println("hello world");
//        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i++ ) {
            System.out.print(i + " ");
        }


        }
    }

