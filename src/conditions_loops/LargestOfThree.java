package conditions_loops;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//   q: find largest of three numbers
//        int max = a;
//        if(b > max) {
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);

        int max = 0;
        if(a > b){
            max = a;
        } else {
            max = b;
            }
        if(c > max){
            max = c;
        }
        System.out.println(max);
        }
      }


