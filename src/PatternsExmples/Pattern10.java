package PatternsExmples;

public class Pattern10 {
    public static void main(String[] args) {
        int n  = 5;
        for(int row = 1; row <= n;row++){
            //spaces before it
            for(int space = row; space < n;space++){
                System.out.print( " ");
            }
            for (int col = 1; col <= (2*row-1); col++) {
                if (col == 1 || col == (2*row -1)|| row == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
