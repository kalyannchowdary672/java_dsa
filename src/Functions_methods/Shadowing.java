package Functions_methods;

public class Shadowing {
    static int x = 90; // shadow  this value at 9
    public static void main(String[] args) {
        System.out.println(x);
        int x ; //declaration
        x= 100; //initialisation : it will begin scope after initialisation only
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);


    }
}
