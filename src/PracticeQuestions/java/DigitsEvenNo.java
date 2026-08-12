package PracticeQuestions.java;

public class DigitsEvenNo {
    public static void main(String[] args) {

      int n = 583266;
      int count =0;
       while(n > 0) {
           int digit = n % 10;
           if(digit % 2 == 0){
               count ++;
           }
           n = n/10;
       }

        System.out.println(count);
    }
}
