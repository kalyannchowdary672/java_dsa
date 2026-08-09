package PracticeQuestions.java;

public class CheckEven {
    public static void main(String[] args) {
        boolean answer =  IsEven(6);
        System.out.println(answer);

    }
    static boolean IsEven(int a){
        return a % 2 == 0;
    }

}
