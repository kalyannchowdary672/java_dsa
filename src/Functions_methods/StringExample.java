package Functions_methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("enter your name:");
        String name = input.next();
        String message=greet(name);
        System.out.println(message);
    }


    static String greet(String name){
        String greet = "my name is "+name;
        return greet ;
//    static String greet(){
//        String greeting = "how are you";
//        return greeting;
    }
}