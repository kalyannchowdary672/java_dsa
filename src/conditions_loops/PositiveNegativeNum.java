package conditions_loops;

import java.util.Scanner;

public class PositiveNegativeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if( n >= 0){
            System.out.println("positive number");
        }else if( n < 0){
            System.out.println("negative number");
        }else if (n == 0){
            System.out.println("zero");
        }
        }
    }

