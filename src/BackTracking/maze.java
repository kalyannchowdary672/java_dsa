package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maze {
    public static void main(String[] args) {

        path("",3,3);
        System.out.println(pathRet("",3,3));
        System.out.println(pathRetDiagonal("",3,3));
    }
    static int count(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);

        return left + right;
    }
    static void path(String p,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p+'d',row-1,col);
        }
        if(col > 1){
            path( p + 'r',row,col-1);
        }
    }
    static ArrayList<String> pathRet(String p, int row, int col){
        if(row == 1 && col == 1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
           list.addAll(pathRet(p+'d',row-1,col));
        }
        if(col > 1){
            list.addAll(pathRet( p + 'r',row,col-1));
        }
        return list;
    }
    static ArrayList<String> pathRetDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(pathRetDiagonal(p + 'c',row -1,col -1));
        }
        if(row > 1){
            list.addAll(pathRetDiagonal(p+'d',row-1,col));
        }
        if(col > 1){
            list.addAll(pathRetDiagonal( p + 'r',row,col-1));
        }
        return list;
    }
}
