package PracticeQuestions.java;

public class MaxMinArrExample {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 2, 9, 4, 7};
        int max = arr[0];
        int min = arr[0];
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index]>max){
                max = arr[index];
            }if(arr[index] < min){
                min = arr[index];
            }
        }
        System.out.println(max - min);
    }
}
