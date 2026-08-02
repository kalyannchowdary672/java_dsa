package Functions_methods;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(2,7,9,765,876,87543,543);
        multiple(10 ,20, "Kalyan", "sai");
    }
     static void multiple(int a ,int b,String...v){
         System.out.println(Arrays.toString(v));
}
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
