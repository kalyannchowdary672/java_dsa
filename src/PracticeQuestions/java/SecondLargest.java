package PracticeQuestions.java;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {4, 9, 12, 7, 18, 5, 21};
        int max = arr[0];
        int SecondMax = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max) {
                SecondMax = max;
                max = arr[index];
            }if(arr[index] < SecondMax){
                SecondMax = arr[index];
            }

        }
        System.out.println(SecondMax);
    }
}

