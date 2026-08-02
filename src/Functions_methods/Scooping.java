package Functions_methods;

public class Scooping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println(num); // here we cannot print value of num because we should have define num in the braces itself

        {  // block scoping
          //  int a = 10; // already initialised inside the value in the same function so we cannot  use variable
             a = 100; //but we can reassign value of original value to other value
                      //values initialised this block ,will remain in the block only
        }
    }
        static void random (int marks){ // function scoping
            int num = 20;
            System.out.println(num);
            System.out.println(marks); // variables are accessed in that function only not outside the function
//        System.out.println(a);// here we cannot print a bcz it does not belong to this function

        }
        //scope in for loop
    {
        for (int i = 0; i < 4 ; i++) {
            System.out.println(i);
              
        }
       // System.out.println(i);// cannot print bcs outside the block

    }
    }

