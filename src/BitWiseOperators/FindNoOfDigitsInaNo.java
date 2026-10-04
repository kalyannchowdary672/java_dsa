package BitWiseOperators;

public class FindNoOfDigitsInaNo {
    public static void main(String[] args) {
        int a = 6;
        int base = 2;
        int ans = (int)(Math.log(a)/Math.log(base)) + 1;
        System.out.print(ans);
    }
}
