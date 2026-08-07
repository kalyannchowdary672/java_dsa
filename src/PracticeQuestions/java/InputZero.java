package PracticeQuestions.java;

import java.util.Scanner;

public class InputZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number :" + "  ");
        int n= in.nextInt();
        while(n != 0){
            System.out.println(n);
             n = in.nextInt();
        }

    }
}
