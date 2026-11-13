package BackTracking;

public class maze {
    public static void main(String[] args) {

        path("",3,3);
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
}
