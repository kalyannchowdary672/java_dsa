package Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(subseq(" " ,"abc"));

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
    static ArrayList<String> subseq(String dul, String org){
        if(org.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(dul);
            return list;
        }
        char ch = org.charAt(0);

        ArrayList<String> left = subseq(dul+ch,org.substring(1));
        ArrayList<String> right = subseq(dul,org.substring(1));

        left.addAll(right);
        return left;

    }
}
