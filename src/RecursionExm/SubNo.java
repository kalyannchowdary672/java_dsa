package RecursionExm;

public class SubNo {
    public static void main(String[] args) {
        sub(8);
    }
    static void sub(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        sub(--n);
    }
}
