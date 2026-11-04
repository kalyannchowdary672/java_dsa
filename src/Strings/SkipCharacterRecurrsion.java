package Strings;

public class SkipCharacterRecurrsion {
    public static void main(String[] args) {
//        skip("","abbdcae");
        System.out.print(skipApple("abapplebdcae"));

    }
    static void  skip(String dul ,String org){
        if(org.isEmpty()){
            System.out.print(dul);
            return;
        }
        char ch = org.charAt(0);

        if(ch == 'a'){
            skip(dul,org.substring(1));
        }else{
            skip(dul + ch,org.substring(1));
        }
    }
    static String  skip(String org) {
        if (org.isEmpty()) {
            return "";
        }
        char ch = org.charAt(0);

        if (ch == 'a') {
           return  skip( org.substring(1));
        } else {
           return ch+skip( org.substring(1));
        }
    }
    static String  skipApple(String org) {
        if (org.isEmpty()) {
            return "";
        }
        if (org.startsWith("apple")) {
            return  skipApple( org.substring(5));
        } else {
            return org.charAt(0)+skipApple( org.substring(1));
        }
    }
}
