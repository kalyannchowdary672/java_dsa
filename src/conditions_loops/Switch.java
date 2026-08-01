package conditions_loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
         syntax of switch

         switch (expression){
         case 1 :
         // do sth
         break;
         case 2 :
         // do sth
         break;
         default:
         // do sth

         */
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "mango":
                System.out.println("yellow color");
                break;
            case "apple":
                System.out.println("red color");
                break;
            case "grapes":
                System.out.println("purple color");
                break;
            default:
                System.out.println("invalid fruit");

                // to write more clear we can switch to enhanced switch

                switch (fruit) {
                    case "mango" -> System.out.println("yellow color");
                    case "apple" -> System.out.println("red color");
                    case "grapes" -> System.out.println("purple color");
                    default -> System.out.println("invalid fruit");
                }
        }
    }
}

