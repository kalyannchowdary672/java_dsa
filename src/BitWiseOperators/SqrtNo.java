package BitWiseOperators;

public class SqrtNo {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        //preety printing can be used there to get only three digits
        System.out.printf("%.3f",sqrt(n,p));
    }

    private static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid * mid == n){
                return mid;
            }if(mid * mid > n){
                end = mid -1;
            }else{
                start = mid + 1;
            }
            double incr = 0.1;
            for (int i = 0; i < p; i++) {
                while(root * root <= n){
                    root += incr;
                }
                root -= incr;

            }
        }
        return root;
    }
}
