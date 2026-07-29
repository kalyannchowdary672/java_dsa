import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//                                               automatic casting bigger to smaller conversion is automatic
//         float num = input.nextFloat();
//        int num = input.nextInt();
//         System.out.println(num);
//                                              smaller to bigger we have rules to convert
//            int num = (int) (89.90f); // we use this method to convert bigger to smaller
//            System.out.println(num);

            byte a = 80;
            byte b = 90;
            byte c = 60;
            int d =  a*b/c;
        System.out.println(d);

    }
}
