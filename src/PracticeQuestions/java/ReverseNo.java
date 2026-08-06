package PracticeQuestions.java;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m;
        while(n>0){
            m = n % 10;
            n =n/10;

            System.out.print(m);
        }

    }
}
