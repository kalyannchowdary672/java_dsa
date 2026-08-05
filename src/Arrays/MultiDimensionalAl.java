package Arrays;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalAl {
    public static void main() {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList> list = new ArrayList<>();

        for (int i = 0; i < 3  ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
        }
    }

