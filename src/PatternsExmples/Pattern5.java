package PatternsExmples;

public class Pattern5 {
    public static void main(String[] args) {
        Pattern6(5);

    }static void Pattern6(int n){
        for (int row = 0 ; row < 2 * n ; row++) {
            int totalcol = row > n ? 2 * n - row : row;
            for (int col = 0 ; col < totalcol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
