package PracticeQuestions.java;

public class MaxExample {
    public static void main(String[] args) {
        int max = maxvalue(23 ,98);
        System.out.println(max);

    }
    static int maxvalue(int a ,int b){
        if(a > b){
            return a ;
        }else{
            return b ;
        }
    }
}
