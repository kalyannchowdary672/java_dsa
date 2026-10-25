package LeetcodeRecursionProblems;

public class PowerOfN {
    public static void main(String[] args) {
        class Solution {
            public double myPow(double x, int n) {
                long N = n;
                if(N < 0){
                    N = -N;
                }
                double result = pow(x,N);
                return n < 0 ? 1/result :result;
            }
            public double pow(double x,long n){
                if(n == 0){
                    return 1;
                }
                double half = pow(x,n/2);
                if(n % 2 == 0){
                    return half * half;
                }else{
                    return half * half * x;
                }
            }
        }
    }
}
