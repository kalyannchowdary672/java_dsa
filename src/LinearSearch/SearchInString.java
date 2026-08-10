package LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "kalyan";
        char target = 'a';
//        System.out.print(Search(name, target));
        System.out.print(Arrays.toString(name.toCharArray()));
    }
        static boolean Search2(String str , char target ) {
            if (str.length() == 0) {
                return false;

            }
            for(char ch : str.toCharArray()){
                if( ch ==  target){
                    return true;
                }

                }
            return false;
    }
    static boolean Search(String str , char target ) {
        if (str.length() == 0) {
            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
