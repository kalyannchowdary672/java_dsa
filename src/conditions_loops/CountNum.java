package conditions_loops;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        // with taking input

//        Scanner input = new Scanner(System.in);
//        long n = input.nextInt();
//        int count = 0;
//        while(n > 0){
//             long rem = n % 10;
//             if(rem == 8){
//                 count++;
//             }
//             n = n/10;
//        }
//        System.out.println(count);

        //without taking input

        int n = 33436;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n / 10 ;
        }
        System.out.println(count);
    }
}
