package BitWiseOperators;

public class OodEvenInBit {
    public static void main(String[] args) {
        int n = 66;
        System.out.print(isOdd(n));

    }static boolean isOdd(int n){
        return (n&1) == 1;
   }
}
