package PracticeQuestions.java;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
}
