package Arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // to add arraylist
//        list.add(12);
//        list.add(890);
//        list.add(89765);
//        list.add(2345);

//        System.out.println(list.contains(11));
//        System.out.println(list);
//        list.set(0,67);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
//        System.out.println(list);

    }
}

