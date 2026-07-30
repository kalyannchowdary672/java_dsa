package conditions_loops;

public class conditions {
    public static void main(String[] args) {
        /*
         syntax of if else statement
        if (true or false boolean expression){
           // body
        } else {
            //do sth
        }
                      */
//        int Marks = 150;
//        if (Marks > 100) {
//            System.out.println(90);
//        } else {
//            System.out.println(60);
//        }
//        int students = 200;
//        if(students > 300) {
//            students = students + 100;
//        }  else {
//            students = students - 100;
//        }
//        System.out.println(students);

//        now multiple if else statements
        int students = 2000;
        if(students > 3000) {
            students += 1000;
        } else if(students > 2000) {
            students += 2000;
        } else {
            students += 200;
        }
        System.out.println(students);
        }

    }
