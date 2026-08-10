package PracticeQuestions.java;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);

            }
        }
    }
}




