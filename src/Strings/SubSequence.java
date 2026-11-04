package Strings;

public class SubSequence {
    public static void main(String[] args) {
        subset(" " ,"abc");

    }
    static void subset(String dul, String org){
        if(org.isEmpty()){
            System.out.println(dul);
            return;
        }
        char ch = org.charAt(0);

        subset( dul + ch,org.substring(1));
        subset(dul,org.substring(1));
    }
}
