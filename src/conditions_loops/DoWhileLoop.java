package conditions_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         syntax of do while loop
         do{
         //sth
         } while(condition){
         body
         }
         */
        // no matter what condition it will execute first step always
        int n = 1 ;
        do {
            System.out.println( "hello world");
            n++;
        } while( n <= 10 );

        }
    }

