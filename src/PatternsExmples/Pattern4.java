package PatternsExmples;

public class Pattern4 {
    public static void main(String[] args) {
        Pattern4(6);

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
