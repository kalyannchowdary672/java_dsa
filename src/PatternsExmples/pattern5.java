package PatternsExmples;

public class pattern5 {
    public static void main(String[] args) {

    }
    static void Pattern4(int n){
        for (int row = 1; row < n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
