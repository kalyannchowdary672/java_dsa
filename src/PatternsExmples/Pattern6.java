package PatternsExmples;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(4);
    }
    static void pattern6(int n){
        for (int row = 0; row < 2 * n ; row++) {
            int totalCol = row > n ? 2* n - row : row;
            int noOfSpace = n - totalCol;
            for (int space = 0; space < noOfSpace; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
