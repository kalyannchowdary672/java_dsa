package BitWiseOperators;


public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.print(set(n));
    }
    public static int set(int n){
        int count =0;
        while( n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
