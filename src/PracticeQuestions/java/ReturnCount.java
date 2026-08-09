package PracticeQuestions.java;

public class ReturnCount {
    public static void main(String[] args) {
       int countno = count(8775);
        System.out.println(countno);
    }static int count(int a){
        int countno = 0;

      while (a > 0) {
          a = a / 10;
          countno++;
      }
        return countno;
    }
}
