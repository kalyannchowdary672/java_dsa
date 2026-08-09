package PracticeQuestions.java;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {2, 8, 65, 4, 8};
        int max = arr[0];
        if (arr[1] > max) {
            max = arr[1];
            System.out.println(max);
        } else if (arr[2] > max) {
            max = arr[2];
            System.out.println(max);
        } else if (arr[3] > max) {
            max = arr[3];
            System.out.println(max);
        } else if (arr[4] > max) {
            max = arr[4];
            System.out.println(max);
        }
    }
}
