package PracticeQuestions.java;

public class ReturnLargestof3 {
    public static void main(String[] args) {
        int maxvalue = largest(23 , 56 ,86);
        System.out.println(maxvalue);
    }static int largest(int a , int b , int c) {
        int max = a;
        if (max < b) {
            max = b;
        }if (max < c) {
            max = c;
        }
        return max;
    }
}
