package conditions_loops;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day = input.next();

//        switch(day) {
//            case "1":
//                System.out.println("Monday");
//                break;
//            case "2":
//                System.out.println("Tuesday");
//                break;
//            case "3":
//                System.out.println("Wednesday");
//                break;
//            case "4":
//                System.out.println("Thursday");
//                break;
//            case "5":
//                System.out.println("Friday");
//                break;
//            case "6":
//                System.out.println("Saturday");
//                break;
//            case "7":
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("invalid day");
//
//                with enhanced switch
//                switch (day) {
//                    case "1" -> System.out.println("Monday");
//                    case "2" -> System.out.println("Tuesday");
//                    case "3" -> System.out.println("Wednesday");
//                    case "4" -> System.out.println("Thursday");
//                    case "5" -> System.out.println("Friday");
//                    case "6" -> System.out.println("Saturday");
//                    case "7" -> System.out.println("Sunday");
//                    default -> System.out.println("invalid day");
//                }
        switch (day) {
            case "1", "2", "3", "4", "5" -> System.out.println("weekdays");
            case "6", "7" -> System.out.println("weekends");
            default -> System.out.println("invalid day");
        }
    }
}
