package PracticeQuestions.java;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mul;

        for (int i = 1; i <= 10 ; i++) {
            mul = n * i ;
            System.out.println(mul);

        }
    }
}
