package Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(phonePad("","12"));

    }
    static void pad(String dul,String org){
        if(org.isEmpty()){
            System.out.println(dul);
            return;
        }
        int digit = org.charAt(0) - '0';
        for(int i = (digit - 1) * 3;i < digit * 3;i++){
            char ch = (char)('a' + i);
            pad(dul+ch,org.substring(1));
        }
    }
    static ArrayList<String> phonePad(String dul, String org){
        if(org.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(dul);
            return list;
        }
        int digit = org.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit - 1)* 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            list.addAll(phonePad(dul+ch,org.substring(1)));

        }
        return list;
    }
}
