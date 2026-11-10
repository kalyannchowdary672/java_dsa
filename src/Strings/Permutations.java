package Strings;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutationCount("","abcde"));
    }
    static void permutation(String dul,String org){
        if(org.isEmpty()){
            System.out.println(dul);
            return;
        }
        char ch = org.charAt(0);
        for(int i = 0; i <= dul.length(); i++){
            String first = dul.substring(0,i);
            String second = dul.substring(i,dul.length());
            permutation(first + ch + second,org.substring(1));
        }

    }
    static int permutationCount(String dul,String org){
        if(org.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = org.charAt(0);
        for(int i = 0; i <= dul.length(); i++){
            String first = dul.substring(0,i);
            String second = dul.substring(i,dul.length());
            count += permutationCount(first + ch + second,org.substring(1));
        }
        return count;
    }
}
