package PracticeQuestions.java;

public class CountArrExample {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 4, 7, 9, 2, 7};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 7){
                count++;
            }

        }
        System.out.println(count);
    }
}
