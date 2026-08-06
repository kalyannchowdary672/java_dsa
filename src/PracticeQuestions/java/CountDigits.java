package PracticeQuestions.java;

import java.util.Scanner;


public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0 ;

        while(n>0){
                n = n/10;
                count++;

            }
        System.out.println(count);
        }
    }

