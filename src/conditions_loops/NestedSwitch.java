package conditions_loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String Department = in.next();

//        switch(EmpId){
//            case 1 :
//                System.out.println("Kalyan");
//                break;
//            case 2 :
//                System.out.println("Sai");
//                break;
//            case 3 :
//                System.out.println("number 3");
//                switch (Department){
//                    case "it" :
//                        System.out.println("It Department");
//                        break;
//                    case "mechanical" :
//                        System.out.println("Mechanical department");
//                        break;
//                }
//                break;
//            default :
//                System.out.println("invalid input");
//

                // better way to write
                switch (EmpId) {
                    case 1 -> System.out.println("Kalyan");
                    case 2 -> System.out.println("Sai");
                    case 3 -> {
                        System.out.println("number 3");
                        switch (Department) {
                            case "it" -> System.out.println("It Department");
                            case "mechanical" -> System.out.println("Mechanical department");
                        }
                    }
                    default -> System.out.println("invalid input");
                }
    }
}
