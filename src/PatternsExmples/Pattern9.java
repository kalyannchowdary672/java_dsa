package PatternsExmples;


public class Pattern9 {
    public static void main(String[] args) {
        pattern(6);

    }
    static void pattern(int n){
        int original = n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int EveryIndex = n - Math.min(Math.min(row,col),Math.min(n - row,n - col));
                System.out.print(EveryIndex + " ");
            }
            System.out.println();
        }

    }

}
