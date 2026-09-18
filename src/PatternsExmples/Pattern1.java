package PatternsExmples;

public class Pattern1 {
    public static void main(String[] args) {
        Pattern(4);
    }
    static void Pattern(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
