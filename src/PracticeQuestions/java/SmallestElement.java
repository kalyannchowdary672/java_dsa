package PracticeQuestions.java;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = { 10, 25, 7, 42, 18, 31};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
