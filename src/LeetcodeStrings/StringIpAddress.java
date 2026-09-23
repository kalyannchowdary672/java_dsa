package LeetcodeStrings;

public class StringIpAddress {
    public static void main(String[] args) {
        class Solution {
            public String defangIPaddr(String address) {
                StringBuilder Ip = new StringBuilder();
                for(int i = 0 ; i < address.length(); i++){
                    char c = address.charAt(i);
                    if(c == '.'){
                        Ip.append("[.]");
                    }else{
                        Ip.append(c);
                    }
                }
                return Ip.toString();
            }
        }
    }
}
