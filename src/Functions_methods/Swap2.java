package Functions_methods;

public class Swap2 {
    public static void main(String[] args) {
        int a = 40 ;
        int b = 60 ;
        swap(a,b);
        System.out.println(a + " "+b);

        String name = "kalyan";
        ChangeName(name);
        System.out.println(name);
    }

    private static void ChangeName(String name) {
        name = "chowdary" ;
    }

    static void swap(int a , int b){
        int temp = a ; //here it cannot swap in functions because it only copy the values  and make change in copied values so original values will bse like that only
        a = b;
        b = temp ;

    }
}
