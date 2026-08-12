package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums ={ 12 , 345, 2, 6, 7896, 98};
        System.out.println(FindNumbers(nums));

    }
    static int FindNumbers( int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num))
                count++;
        }

        return count;
    }
    // check whether it is even or not
    static boolean even(int num){
        int numofdigits = digits(num);
        if(numofdigits % 2 == 0){
            return true;
        }
        return false;
// it is used to counts the digits
    }
    static int digits(int num){
        int count = 0;
        while( num > 0){
            count++;
            num = num/10;
        }

        return count;
    }
}

