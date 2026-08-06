package PracticeQuestions.java;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if (b > max) {
            System.out.println(b);
        } else if (c > max) {
            System.out.println(c);
        }
    }
}
