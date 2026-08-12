package LinearSearch;

public class WealthOfRichest {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1}
        };
      int ans =  MaximumWealth(arr);
        System.out.print(ans);
    }

    public static int MaximumWealth(int[][] accounts) {
        // person = rows
        // accounts = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;// initialize sum here
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
